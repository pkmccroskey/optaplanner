/*
 * Copyright 2012 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.drools.planner.core.constructionheuristic.greedyFit.decider;

import java.util.Random;

import org.drools.WorkingMemory;
import org.drools.planner.core.constructionheuristic.greedyFit.GreedyFitStepScope;
import org.drools.planner.core.localsearch.LocalSearchStepScope;
import org.drools.planner.core.move.Move;
import org.drools.planner.core.score.Score;
import org.drools.planner.core.solution.Solution;

public class GreedyMoveScope {

    private final GreedyFitStepScope greedyFitStepScope;
    private Move move = null;
    private Move undoMove = null;
    private Score score = null;

    public GreedyMoveScope(GreedyFitStepScope greedyFitStepScope) {
        this.greedyFitStepScope = greedyFitStepScope;
    }

    public GreedyFitStepScope getGreedyFitStepScope() {
        return greedyFitStepScope;
    }

    public Move getMove() {
        return move;
    }

    public void setMove(Move move) {
        this.move = move;
    }

    public Move getUndoMove() {
        return undoMove;
    }

    public void setUndoMove(Move undoMove) {
        this.undoMove = undoMove;
    }

    public Score getScore() {
        return score;
    }

    public void setScore(Score score) {
        this.score = score;
    }

    // ************************************************************************
    // Calculated methods
    // ************************************************************************

    public Solution getWorkingSolution() {
        return greedyFitStepScope.getWorkingSolution();
    }

    public WorkingMemory getWorkingMemory() {
        return greedyFitStepScope.getWorkingMemory();
    }

    public Random getWorkingRandom() {
        return greedyFitStepScope.getWorkingRandom();
    }

}