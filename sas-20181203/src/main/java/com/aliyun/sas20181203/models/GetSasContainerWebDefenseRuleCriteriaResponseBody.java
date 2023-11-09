// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetSasContainerWebDefenseRuleCriteriaResponseBody extends TeaModel {
    @NameInMap("CriteriaList")
    public java.util.List<GetSasContainerWebDefenseRuleCriteriaResponseBodyCriteriaList> criteriaList;

    @NameInMap("RequestId")
    public String requestId;

    public static GetSasContainerWebDefenseRuleCriteriaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSasContainerWebDefenseRuleCriteriaResponseBody self = new GetSasContainerWebDefenseRuleCriteriaResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSasContainerWebDefenseRuleCriteriaResponseBody setCriteriaList(java.util.List<GetSasContainerWebDefenseRuleCriteriaResponseBodyCriteriaList> criteriaList) {
        this.criteriaList = criteriaList;
        return this;
    }
    public java.util.List<GetSasContainerWebDefenseRuleCriteriaResponseBodyCriteriaList> getCriteriaList() {
        return this.criteriaList;
    }

    public GetSasContainerWebDefenseRuleCriteriaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetSasContainerWebDefenseRuleCriteriaResponseBodyCriteriaList extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Type")
        public String type;

        @NameInMap("Values")
        public String values;

        public static GetSasContainerWebDefenseRuleCriteriaResponseBodyCriteriaList build(java.util.Map<String, ?> map) throws Exception {
            GetSasContainerWebDefenseRuleCriteriaResponseBodyCriteriaList self = new GetSasContainerWebDefenseRuleCriteriaResponseBodyCriteriaList();
            return TeaModel.build(map, self);
        }

        public GetSasContainerWebDefenseRuleCriteriaResponseBodyCriteriaList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetSasContainerWebDefenseRuleCriteriaResponseBodyCriteriaList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetSasContainerWebDefenseRuleCriteriaResponseBodyCriteriaList setValues(String values) {
            this.values = values;
            return this;
        }
        public String getValues() {
            return this.values;
        }

    }

}
