// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20260120.models;

import com.aliyun.tea.*;

public class ListRiskLevelsResponseBody extends TeaModel {
    /**
     * <p>The request ID. You can use this ID to locate the API call.</p>
     * 
     * <strong>example:</strong>
     * <p>7C6D8E9F-1234-5678-ABCD-0123456789AB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of sensitivity levels.</p>
     */
    @NameInMap("RiskLevelList")
    public java.util.List<ListRiskLevelsResponseBodyRiskLevelList> riskLevelList;

    public static ListRiskLevelsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRiskLevelsResponseBody self = new ListRiskLevelsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRiskLevelsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRiskLevelsResponseBody setRiskLevelList(java.util.List<ListRiskLevelsResponseBodyRiskLevelList> riskLevelList) {
        this.riskLevelList = riskLevelList;
        return this;
    }
    public java.util.List<ListRiskLevelsResponseBodyRiskLevelList> getRiskLevelList() {
        return this.riskLevelList;
    }

    public static class ListRiskLevelsResponseBodyRiskLevelList extends TeaModel {
        /**
         * <p>The description of the sensitivity level.</p>
         * 
         * <strong>example:</strong>
         * <p>Personal information data</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the sensitivity level.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The name of the sensitivity level.</p>
         * 
         * <strong>example:</strong>
         * <p>S2</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The number of references to the sensitivity level.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("ReferenceNum")
        public Integer referenceNum;

        public static ListRiskLevelsResponseBodyRiskLevelList build(java.util.Map<String, ?> map) throws Exception {
            ListRiskLevelsResponseBodyRiskLevelList self = new ListRiskLevelsResponseBodyRiskLevelList();
            return TeaModel.build(map, self);
        }

        public ListRiskLevelsResponseBodyRiskLevelList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListRiskLevelsResponseBodyRiskLevelList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListRiskLevelsResponseBodyRiskLevelList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListRiskLevelsResponseBodyRiskLevelList setReferenceNum(Integer referenceNum) {
            this.referenceNum = referenceNum;
            return this;
        }
        public Integer getReferenceNum() {
            return this.referenceNum;
        }

    }

}
