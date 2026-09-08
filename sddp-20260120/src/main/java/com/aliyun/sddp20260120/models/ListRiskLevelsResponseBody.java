// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20260120.models;

import com.aliyun.tea.*;

public class ListRiskLevelsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Description")
        public String description;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

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
