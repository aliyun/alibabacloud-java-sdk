// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class SchemeCheckType extends TeaModel {
    @NameInMap("CheckName")
    public String checkName;

    @NameInMap("CheckType")
    public Long checkType;

    @NameInMap("Enable")
    public Integer enable;

    @NameInMap("SchemeId")
    public Long schemeId;

    @NameInMap("SchemeScoreInfoList")
    public java.util.List<SchemeCheckTypeSchemeScoreInfoList> schemeScoreInfoList;

    @NameInMap("Score")
    public Integer score;

    @NameInMap("SourceScore")
    public Integer sourceScore;

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
        @NameInMap("Name")
        public String name;

        @NameInMap("Rid")
        public Long rid;

        @NameInMap("ScoreNum")
        public Integer scoreNum;

        @NameInMap("ScoreNumType")
        public Integer scoreNumType;

        @NameInMap("ScoreRuleHitType")
        public Integer scoreRuleHitType;

        @NameInMap("ScoreType")
        public Integer scoreType;

        @NameInMap("TaskFlowId")
        public Long taskFlowId;

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
        @NameInMap("Name")
        public String name;

        @NameInMap("Rid")
        public Long rid;

        @NameInMap("ScoreNum")
        public Integer scoreNum;

        @NameInMap("ScoreNumType")
        public Integer scoreNumType;

        @NameInMap("ScoreRuleHitType")
        public Integer scoreRuleHitType;

        @NameInMap("ScoreType")
        public Integer scoreType;

        @NameInMap("TaskFlowId")
        public Long taskFlowId;

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
        @NameInMap("SchemeScoreInfoList")
        public java.util.List<SchemeCheckTypeTaskFlowScoreInfoListSchemeScoreInfoList> schemeScoreInfoList;

        @NameInMap("TaskFlowId")
        public Long taskFlowId;

        @NameInMap("TaskFlowName")
        public String taskFlowName;

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
