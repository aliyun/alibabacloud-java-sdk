// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class StartAIDiffAnalysisRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("task1")
    public StartAIDiffAnalysisRequestTask1 task1;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("task2")
    public StartAIDiffAnalysisRequestTask2 task2;

    public static StartAIDiffAnalysisRequest build(java.util.Map<String, ?> map) throws Exception {
        StartAIDiffAnalysisRequest self = new StartAIDiffAnalysisRequest();
        return TeaModel.build(map, self);
    }

    public StartAIDiffAnalysisRequest setTask1(StartAIDiffAnalysisRequestTask1 task1) {
        this.task1 = task1;
        return this;
    }
    public StartAIDiffAnalysisRequestTask1 getTask1() {
        return this.task1;
    }

    public StartAIDiffAnalysisRequest setTask2(StartAIDiffAnalysisRequestTask2 task2) {
        this.task2 = task2;
        return this;
    }
    public StartAIDiffAnalysisRequestTask2 getTask2() {
        return this.task2;
    }

    public static class StartAIDiffAnalysisRequestTask1 extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>16896fa8-37f6-4c70-bb32-67fa9817d426</p>
         */
        @NameInMap("analysisId")
        public String analysisId;

        @NameInMap("pids")
        public java.util.List<String> pids;

        /**
         * <strong>example:</strong>
         * <p>4660551334179.955</p>
         */
        @NameInMap("step_end")
        public Float stepEnd;

        /**
         * <strong>example:</strong>
         * <p>4660550379415.497</p>
         */
        @NameInMap("step_start")
        public Float stepStart;

        public static StartAIDiffAnalysisRequestTask1 build(java.util.Map<String, ?> map) throws Exception {
            StartAIDiffAnalysisRequestTask1 self = new StartAIDiffAnalysisRequestTask1();
            return TeaModel.build(map, self);
        }

        public StartAIDiffAnalysisRequestTask1 setAnalysisId(String analysisId) {
            this.analysisId = analysisId;
            return this;
        }
        public String getAnalysisId() {
            return this.analysisId;
        }

        public StartAIDiffAnalysisRequestTask1 setPids(java.util.List<String> pids) {
            this.pids = pids;
            return this;
        }
        public java.util.List<String> getPids() {
            return this.pids;
        }

        public StartAIDiffAnalysisRequestTask1 setStepEnd(Float stepEnd) {
            this.stepEnd = stepEnd;
            return this;
        }
        public Float getStepEnd() {
            return this.stepEnd;
        }

        public StartAIDiffAnalysisRequestTask1 setStepStart(Float stepStart) {
            this.stepStart = stepStart;
            return this;
        }
        public Float getStepStart() {
            return this.stepStart;
        }

    }

    public static class StartAIDiffAnalysisRequestTask2 extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>16896fa8-37f6-4c70-bb32-67fa9817d426</p>
         */
        @NameInMap("analysisId")
        public String analysisId;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>452651:python3 ./test.py</p>
         */
        @NameInMap("pids")
        public java.util.List<String> pids;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>4660551334179.955</p>
         */
        @NameInMap("step_end")
        public Float stepEnd;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>4660550379415.497</p>
         */
        @NameInMap("step_start")
        public Float stepStart;

        public static StartAIDiffAnalysisRequestTask2 build(java.util.Map<String, ?> map) throws Exception {
            StartAIDiffAnalysisRequestTask2 self = new StartAIDiffAnalysisRequestTask2();
            return TeaModel.build(map, self);
        }

        public StartAIDiffAnalysisRequestTask2 setAnalysisId(String analysisId) {
            this.analysisId = analysisId;
            return this;
        }
        public String getAnalysisId() {
            return this.analysisId;
        }

        public StartAIDiffAnalysisRequestTask2 setPids(java.util.List<String> pids) {
            this.pids = pids;
            return this;
        }
        public java.util.List<String> getPids() {
            return this.pids;
        }

        public StartAIDiffAnalysisRequestTask2 setStepEnd(Float stepEnd) {
            this.stepEnd = stepEnd;
            return this;
        }
        public Float getStepEnd() {
            return this.stepEnd;
        }

        public StartAIDiffAnalysisRequestTask2 setStepStart(Float stepStart) {
            this.stepStart = stepStart;
            return this;
        }
        public Float getStepStart() {
            return this.stepStart;
        }

    }

}
