// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetAegisContainerPluginRuleCriteriaResponseBody extends TeaModel {
    @NameInMap("CriteriaList")
    public java.util.List<GetAegisContainerPluginRuleCriteriaResponseBodyCriteriaList> criteriaList;

    @NameInMap("RequestId")
    public String requestId;

    public static GetAegisContainerPluginRuleCriteriaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAegisContainerPluginRuleCriteriaResponseBody self = new GetAegisContainerPluginRuleCriteriaResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAegisContainerPluginRuleCriteriaResponseBody setCriteriaList(java.util.List<GetAegisContainerPluginRuleCriteriaResponseBodyCriteriaList> criteriaList) {
        this.criteriaList = criteriaList;
        return this;
    }
    public java.util.List<GetAegisContainerPluginRuleCriteriaResponseBodyCriteriaList> getCriteriaList() {
        return this.criteriaList;
    }

    public GetAegisContainerPluginRuleCriteriaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAegisContainerPluginRuleCriteriaResponseBodyCriteriaList extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Type")
        public String type;

        @NameInMap("Values")
        public String values;

        public static GetAegisContainerPluginRuleCriteriaResponseBodyCriteriaList build(java.util.Map<String, ?> map) throws Exception {
            GetAegisContainerPluginRuleCriteriaResponseBodyCriteriaList self = new GetAegisContainerPluginRuleCriteriaResponseBodyCriteriaList();
            return TeaModel.build(map, self);
        }

        public GetAegisContainerPluginRuleCriteriaResponseBodyCriteriaList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetAegisContainerPluginRuleCriteriaResponseBodyCriteriaList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetAegisContainerPluginRuleCriteriaResponseBodyCriteriaList setValues(String values) {
            this.values = values;
            return this;
        }
        public String getValues() {
            return this.values;
        }

    }

}
