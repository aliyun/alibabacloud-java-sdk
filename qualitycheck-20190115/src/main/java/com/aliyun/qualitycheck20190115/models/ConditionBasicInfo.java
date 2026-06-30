// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class ConditionBasicInfo extends TeaModel {
    /**
     * <p>Detection range</p>
     */
    @NameInMap("Check_range")
    public ConditionBasicInfoCheckRange checkRange;

    /**
     * <p>Condition ID, which may be the primary key in the database or a transformed identifier such as a, b, or c</p>
     * 
     * <strong>example:</strong>
     * <p>a</p>
     */
    @NameInMap("Cid")
    public String cid;

    /**
     * <p>Exclude</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Exclusion")
    public Integer exclusion;

    /**
     * <p>Primary key in the database</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>Lambda expression; for example: a&amp;&amp;b</p>
     * 
     * <strong>example:</strong>
     * <p>a</p>
     */
    @NameInMap("Lambda")
    public String lambda;

    /**
     * <p>Condition name</p>
     * 
     * <strong>example:</strong>
     * <p>xx</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>List of operators</p>
     */
    @NameInMap("Operators")
    public java.util.List<OperatorBasicInfo> operators;

    /**
     * <p>ID of the rule to which the condition belongs</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Rid")
    public String rid;

    /**
     * <p>User group</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("UserGroup")
    public String userGroup;

    public static ConditionBasicInfo build(java.util.Map<String, ?> map) throws Exception {
        ConditionBasicInfo self = new ConditionBasicInfo();
        return TeaModel.build(map, self);
    }

    public ConditionBasicInfo setCheckRange(ConditionBasicInfoCheckRange checkRange) {
        this.checkRange = checkRange;
        return this;
    }
    public ConditionBasicInfoCheckRange getCheckRange() {
        return this.checkRange;
    }

    public ConditionBasicInfo setCid(String cid) {
        this.cid = cid;
        return this;
    }
    public String getCid() {
        return this.cid;
    }

    public ConditionBasicInfo setExclusion(Integer exclusion) {
        this.exclusion = exclusion;
        return this;
    }
    public Integer getExclusion() {
        return this.exclusion;
    }

    public ConditionBasicInfo setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ConditionBasicInfo setLambda(String lambda) {
        this.lambda = lambda;
        return this;
    }
    public String getLambda() {
        return this.lambda;
    }

    public ConditionBasicInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ConditionBasicInfo setOperators(java.util.List<OperatorBasicInfo> operators) {
        this.operators = operators;
        return this;
    }
    public java.util.List<OperatorBasicInfo> getOperators() {
        return this.operators;
    }

    public ConditionBasicInfo setRid(String rid) {
        this.rid = rid;
        return this;
    }
    public String getRid() {
        return this.rid;
    }

    public ConditionBasicInfo setUserGroup(String userGroup) {
        this.userGroup = userGroup;
        return this;
    }
    public String getUserGroup() {
        return this.userGroup;
    }

    public static class ConditionBasicInfoCheckRangeAnchor extends TeaModel {
        /**
         * <p>Condition ID</p>
         * 
         * <strong>example:</strong>
         * <p>a</p>
         */
        @NameInMap("Cid")
        public String cid;

        /**
         * <p>Hit count</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Hit_time")
        public Integer hitTime;

        /**
         * <p>Location</p>
         * 
         * <strong>example:</strong>
         * <p>BEFORE</p>
         */
        @NameInMap("Location")
        public String location;

        public static ConditionBasicInfoCheckRangeAnchor build(java.util.Map<String, ?> map) throws Exception {
            ConditionBasicInfoCheckRangeAnchor self = new ConditionBasicInfoCheckRangeAnchor();
            return TeaModel.build(map, self);
        }

        public ConditionBasicInfoCheckRangeAnchor setCid(String cid) {
            this.cid = cid;
            return this;
        }
        public String getCid() {
            return this.cid;
        }

        public ConditionBasicInfoCheckRangeAnchor setHitTime(Integer hitTime) {
            this.hitTime = hitTime;
            return this;
        }
        public Integer getHitTime() {
            return this.hitTime;
        }

        public ConditionBasicInfoCheckRangeAnchor setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

    }

    public static class ConditionBasicInfoCheckRangeRange extends TeaModel {
        /**
         * <p>Start index of the conversation</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("From")
        public Integer from;

        /**
         * <p>End index of the conversation</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("To")
        public Integer to;

        public static ConditionBasicInfoCheckRangeRange build(java.util.Map<String, ?> map) throws Exception {
            ConditionBasicInfoCheckRangeRange self = new ConditionBasicInfoCheckRangeRange();
            return TeaModel.build(map, self);
        }

        public ConditionBasicInfoCheckRangeRange setFrom(Integer from) {
            this.from = from;
            return this;
        }
        public Integer getFrom() {
            return this.from;
        }

        public ConditionBasicInfoCheckRangeRange setTo(Integer to) {
            this.to = to;
            return this;
        }
        public Integer getTo() {
            return this.to;
        }

    }

    public static class ConditionBasicInfoCheckRange extends TeaModel {
        /**
         * <p>false: relative position; the sentence position is determined in combination with the anchor and the role</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Absolute")
        public Boolean absolute;

        /**
         * <p>true: Every sentence must satisfy the condition;</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AllSentencesSatisfy")
        public Boolean allSentencesSatisfy;

        /**
         * <p>Precondition and postcondition</p>
         */
        @NameInMap("Anchor")
        public ConditionBasicInfoCheckRangeAnchor anchor;

        /**
         * <p>Relative range</p>
         */
        @NameInMap("Range")
        public ConditionBasicInfoCheckRangeRange range;

        /**
         * <p>Corresponds to RoleType.type</p>
         * 
         * <strong>example:</strong>
         * <p>客服</p>
         */
        @NameInMap("Role")
        public String role;

        /**
         * <p>Corresponds to RoleType.id</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RoleId")
        public Integer roleId;

        public static ConditionBasicInfoCheckRange build(java.util.Map<String, ?> map) throws Exception {
            ConditionBasicInfoCheckRange self = new ConditionBasicInfoCheckRange();
            return TeaModel.build(map, self);
        }

        public ConditionBasicInfoCheckRange setAbsolute(Boolean absolute) {
            this.absolute = absolute;
            return this;
        }
        public Boolean getAbsolute() {
            return this.absolute;
        }

        public ConditionBasicInfoCheckRange setAllSentencesSatisfy(Boolean allSentencesSatisfy) {
            this.allSentencesSatisfy = allSentencesSatisfy;
            return this;
        }
        public Boolean getAllSentencesSatisfy() {
            return this.allSentencesSatisfy;
        }

        public ConditionBasicInfoCheckRange setAnchor(ConditionBasicInfoCheckRangeAnchor anchor) {
            this.anchor = anchor;
            return this;
        }
        public ConditionBasicInfoCheckRangeAnchor getAnchor() {
            return this.anchor;
        }

        public ConditionBasicInfoCheckRange setRange(ConditionBasicInfoCheckRangeRange range) {
            this.range = range;
            return this;
        }
        public ConditionBasicInfoCheckRangeRange getRange() {
            return this.range;
        }

        public ConditionBasicInfoCheckRange setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public ConditionBasicInfoCheckRange setRoleId(Integer roleId) {
            this.roleId = roleId;
            return this;
        }
        public Integer getRoleId() {
            return this.roleId;
        }

    }

}
