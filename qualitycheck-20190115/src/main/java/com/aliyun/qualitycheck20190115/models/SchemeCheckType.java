// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class SchemeCheckType extends TeaModel {
    /**
     * <p>Check item name</p>
     * 
     * <strong>example:</strong>
     * <p>流程规则</p>
     */
    @NameInMap("CheckName")
    public String checkName;

    /**
     * <p>Quality inspection dimension ID</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CheckType")
    public Long checkType;

    /**
     * <p>Is enabled</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Enable")
    public Integer enable;

    /**
     * <p>Quality inspection scheme ID</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SchemeId")
    public Long schemeId;

    /**
     * <p>List of scoring items under the check item. See SchemeScoreInfo.</p>
     */
    @NameInMap("SchemeScoreInfoList")
    public java.util.List<SchemeCheckTypeSchemeScoreInfoList> schemeScoreInfoList;

    /**
     * <p>Final score</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("Score")
    public Integer score;

    /**
     * <p>Original score</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SourceScore")
    public Integer sourceScore;

    /**
     * <p>List of scoring items under the check item. See TaskFlowScoreInfo.</p>
     */
    @NameInMap("TaskFlowScoreInfoList")
    public java.util.List<SchemeCheckTypeTaskFlowScoreInfoList> taskFlowScoreInfoList;

    public static SchemeCheckType build(java.util.Map<String, ?> map) throws Exception {
        SchemeCheckType self = new SchemeCheckType();
        return TeaModel.build(map, self);
    }

    public SchemeCheckType setCheckName(String checkName) {
        this.checkName = checkName;
        return this;
    }
    public String getCheckName() {
        return this.checkName;
    }

    public SchemeCheckType setCheckType(Long checkType) {
        this.checkType = checkType;
        return this;
    }
    public Long getCheckType() {
        return this.checkType;
    }

    public SchemeCheckType setEnable(Integer enable) {
        this.enable = enable;
        return this;
    }
    public Integer getEnable() {
        return this.enable;
    }

    public SchemeCheckType setSchemeId(Long schemeId) {
        this.schemeId = schemeId;
        return this;
    }
    public Long getSchemeId() {
        return this.schemeId;
    }

    public SchemeCheckType setSchemeScoreInfoList(java.util.List<SchemeCheckTypeSchemeScoreInfoList> schemeScoreInfoList) {
        this.schemeScoreInfoList = schemeScoreInfoList;
        return this;
    }
    public java.util.List<SchemeCheckTypeSchemeScoreInfoList> getSchemeScoreInfoList() {
        return this.schemeScoreInfoList;
    }

    public SchemeCheckType setScore(Integer score) {
        this.score = score;
        return this;
    }
    public Integer getScore() {
        return this.score;
    }

    public SchemeCheckType setSourceScore(Integer sourceScore) {
        this.sourceScore = sourceScore;
        return this;
    }
    public Integer getSourceScore() {
        return this.sourceScore;
    }

    public SchemeCheckType setTaskFlowScoreInfoList(java.util.List<SchemeCheckTypeTaskFlowScoreInfoList> taskFlowScoreInfoList) {
        this.taskFlowScoreInfoList = taskFlowScoreInfoList;
        return this;
    }
    public java.util.List<SchemeCheckTypeTaskFlowScoreInfoList> getTaskFlowScoreInfoList() {
        return this.taskFlowScoreInfoList;
    }

    public static class SchemeCheckTypeSchemeScoreInfoList extends TeaModel {
        /**
         * <p>Rule Name</p>
         * 
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Rule ID</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Rid")
        public Long rid;

        /**
         * <p>Agent rating: default 0, [0, 100]</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ScoreNum")
        public Integer scoreNum;

        /**
         * <p>0 – Add or subtract points after triggering a rule</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ScoreNumType")
        public Integer scoreNumType;

        /**
         * <p>0 – Score when hitting an edge zone</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ScoreRuleHitType")
        public Integer scoreRuleHitType;

        /**
         * <p>1 for adding points, 3 for deducting points; default is 1</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ScoreType")
        public Integer scoreType;

        /**
         * <p>Flow ID</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TaskFlowId")
        public Long taskFlowId;

        /**
         * <p>Flow name</p>
         * 
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("TaskFlowName")
        public String taskFlowName;

        public static SchemeCheckTypeSchemeScoreInfoList build(java.util.Map<String, ?> map) throws Exception {
            SchemeCheckTypeSchemeScoreInfoList self = new SchemeCheckTypeSchemeScoreInfoList();
            return TeaModel.build(map, self);
        }

        public SchemeCheckTypeSchemeScoreInfoList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public SchemeCheckTypeSchemeScoreInfoList setRid(Long rid) {
            this.rid = rid;
            return this;
        }
        public Long getRid() {
            return this.rid;
        }

        public SchemeCheckTypeSchemeScoreInfoList setScoreNum(Integer scoreNum) {
            this.scoreNum = scoreNum;
            return this;
        }
        public Integer getScoreNum() {
            return this.scoreNum;
        }

        public SchemeCheckTypeSchemeScoreInfoList setScoreNumType(Integer scoreNumType) {
            this.scoreNumType = scoreNumType;
            return this;
        }
        public Integer getScoreNumType() {
            return this.scoreNumType;
        }

        public SchemeCheckTypeSchemeScoreInfoList setScoreRuleHitType(Integer scoreRuleHitType) {
            this.scoreRuleHitType = scoreRuleHitType;
            return this;
        }
        public Integer getScoreRuleHitType() {
            return this.scoreRuleHitType;
        }

        public SchemeCheckTypeSchemeScoreInfoList setScoreType(Integer scoreType) {
            this.scoreType = scoreType;
            return this;
        }
        public Integer getScoreType() {
            return this.scoreType;
        }

        public SchemeCheckTypeSchemeScoreInfoList setTaskFlowId(Long taskFlowId) {
            this.taskFlowId = taskFlowId;
            return this;
        }
        public Long getTaskFlowId() {
            return this.taskFlowId;
        }

        public SchemeCheckTypeSchemeScoreInfoList setTaskFlowName(String taskFlowName) {
            this.taskFlowName = taskFlowName;
            return this;
        }
        public String getTaskFlowName() {
            return this.taskFlowName;
        }

    }

    public static class SchemeCheckTypeTaskFlowScoreInfoListSchemeScoreInfoList extends TeaModel {
        /**
         * <p>Rule Name</p>
         * 
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Rule ID</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Rid")
        public Long rid;

        /**
         * <p>Agent score: default is 0, range [0, 100]</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("ScoreNum")
        public Integer scoreNum;

        /**
         * <p>0 – Points added or deducted after a rule is triggered</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ScoreNumType")
        public Integer scoreNumType;

        /**
         * <p>0—score when a hit occurs at an edge zone</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ScoreRuleHitType")
        public Integer scoreRuleHitType;

        /**
         * <p>1 for adding points, 3 for deducting points; default is 1</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ScoreType")
        public Integer scoreType;

        /**
         * <p>Flow ID</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TaskFlowId")
        public Long taskFlowId;

        /**
         * <p>flow name</p>
         * 
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("TaskFlowName")
        public String taskFlowName;

        public static SchemeCheckTypeTaskFlowScoreInfoListSchemeScoreInfoList build(java.util.Map<String, ?> map) throws Exception {
            SchemeCheckTypeTaskFlowScoreInfoListSchemeScoreInfoList self = new SchemeCheckTypeTaskFlowScoreInfoListSchemeScoreInfoList();
            return TeaModel.build(map, self);
        }

        public SchemeCheckTypeTaskFlowScoreInfoListSchemeScoreInfoList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public SchemeCheckTypeTaskFlowScoreInfoListSchemeScoreInfoList setRid(Long rid) {
            this.rid = rid;
            return this;
        }
        public Long getRid() {
            return this.rid;
        }

        public SchemeCheckTypeTaskFlowScoreInfoListSchemeScoreInfoList setScoreNum(Integer scoreNum) {
            this.scoreNum = scoreNum;
            return this;
        }
        public Integer getScoreNum() {
            return this.scoreNum;
        }

        public SchemeCheckTypeTaskFlowScoreInfoListSchemeScoreInfoList setScoreNumType(Integer scoreNumType) {
            this.scoreNumType = scoreNumType;
            return this;
        }
        public Integer getScoreNumType() {
            return this.scoreNumType;
        }

        public SchemeCheckTypeTaskFlowScoreInfoListSchemeScoreInfoList setScoreRuleHitType(Integer scoreRuleHitType) {
            this.scoreRuleHitType = scoreRuleHitType;
            return this;
        }
        public Integer getScoreRuleHitType() {
            return this.scoreRuleHitType;
        }

        public SchemeCheckTypeTaskFlowScoreInfoListSchemeScoreInfoList setScoreType(Integer scoreType) {
            this.scoreType = scoreType;
            return this;
        }
        public Integer getScoreType() {
            return this.scoreType;
        }

        public SchemeCheckTypeTaskFlowScoreInfoListSchemeScoreInfoList setTaskFlowId(Long taskFlowId) {
            this.taskFlowId = taskFlowId;
            return this;
        }
        public Long getTaskFlowId() {
            return this.taskFlowId;
        }

        public SchemeCheckTypeTaskFlowScoreInfoListSchemeScoreInfoList setTaskFlowName(String taskFlowName) {
            this.taskFlowName = taskFlowName;
            return this;
        }
        public String getTaskFlowName() {
            return this.taskFlowName;
        }

    }

    public static class SchemeCheckTypeTaskFlowScoreInfoList extends TeaModel {
        /**
         * <p>list of scoring items</p>
         */
        @NameInMap("SchemeScoreInfoList")
        public java.util.List<SchemeCheckTypeTaskFlowScoreInfoListSchemeScoreInfoList> schemeScoreInfoList;

        /**
         * <p>Flow ID</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TaskFlowId")
        public Long taskFlowId;

        /**
         * <p>flow name</p>
         * 
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("TaskFlowName")
        public String taskFlowName;

        /**
         * <p>\&quot;Flow version: 0: tree, 1: graph\&quot;</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TaskFlowType")
        public Integer taskFlowType;

        public static SchemeCheckTypeTaskFlowScoreInfoList build(java.util.Map<String, ?> map) throws Exception {
            SchemeCheckTypeTaskFlowScoreInfoList self = new SchemeCheckTypeTaskFlowScoreInfoList();
            return TeaModel.build(map, self);
        }

        public SchemeCheckTypeTaskFlowScoreInfoList setSchemeScoreInfoList(java.util.List<SchemeCheckTypeTaskFlowScoreInfoListSchemeScoreInfoList> schemeScoreInfoList) {
            this.schemeScoreInfoList = schemeScoreInfoList;
            return this;
        }
        public java.util.List<SchemeCheckTypeTaskFlowScoreInfoListSchemeScoreInfoList> getSchemeScoreInfoList() {
            return this.schemeScoreInfoList;
        }

        public SchemeCheckTypeTaskFlowScoreInfoList setTaskFlowId(Long taskFlowId) {
            this.taskFlowId = taskFlowId;
            return this;
        }
        public Long getTaskFlowId() {
            return this.taskFlowId;
        }

        public SchemeCheckTypeTaskFlowScoreInfoList setTaskFlowName(String taskFlowName) {
            this.taskFlowName = taskFlowName;
            return this;
        }
        public String getTaskFlowName() {
            return this.taskFlowName;
        }

        public SchemeCheckTypeTaskFlowScoreInfoList setTaskFlowType(Integer taskFlowType) {
            this.taskFlowType = taskFlowType;
            return this;
        }
        public Integer getTaskFlowType() {
            return this.taskFlowType;
        }

    }

}
