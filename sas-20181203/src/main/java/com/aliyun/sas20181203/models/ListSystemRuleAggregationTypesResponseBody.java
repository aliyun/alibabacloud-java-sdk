// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListSystemRuleAggregationTypesResponseBody extends TeaModel {
    @NameInMap("AggregationTypeList")
    public java.util.List<ListSystemRuleAggregationTypesResponseBodyAggregationTypeList> aggregationTypeList;

    @NameInMap("RequestId")
    public String requestId;

    public static ListSystemRuleAggregationTypesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSystemRuleAggregationTypesResponseBody self = new ListSystemRuleAggregationTypesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSystemRuleAggregationTypesResponseBody setAggregationTypeList(java.util.List<ListSystemRuleAggregationTypesResponseBodyAggregationTypeList> aggregationTypeList) {
        this.aggregationTypeList = aggregationTypeList;
        return this;
    }
    public java.util.List<ListSystemRuleAggregationTypesResponseBodyAggregationTypeList> getAggregationTypeList() {
        return this.aggregationTypeList;
    }

    public ListSystemRuleAggregationTypesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListSystemRuleAggregationTypesResponseBodyAggregationTypeList extends TeaModel {
        @NameInMap("Id")
        public Integer id;

        @NameInMap("Name")
        public String name;

        public static ListSystemRuleAggregationTypesResponseBodyAggregationTypeList build(java.util.Map<String, ?> map) throws Exception {
            ListSystemRuleAggregationTypesResponseBodyAggregationTypeList self = new ListSystemRuleAggregationTypesResponseBodyAggregationTypeList();
            return TeaModel.build(map, self);
        }

        public ListSystemRuleAggregationTypesResponseBodyAggregationTypeList setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public ListSystemRuleAggregationTypesResponseBodyAggregationTypeList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
