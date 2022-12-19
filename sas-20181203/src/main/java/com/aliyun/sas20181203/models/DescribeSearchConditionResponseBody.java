// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSearchConditionResponseBody extends TeaModel {
    // An array that consists of the filter conditions.
    @NameInMap("ConditionList")
    public java.util.List<DescribeSearchConditionResponseBodyConditionList> conditionList;

    // The ID of the request, which is used to locate and troubleshoot issues.
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeSearchConditionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSearchConditionResponseBody self = new DescribeSearchConditionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSearchConditionResponseBody setConditionList(java.util.List<DescribeSearchConditionResponseBodyConditionList> conditionList) {
        this.conditionList = conditionList;
        return this;
    }
    public java.util.List<DescribeSearchConditionResponseBodyConditionList> getConditionList() {
        return this.conditionList;
    }

    public DescribeSearchConditionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeSearchConditionResponseBodyConditionList extends TeaModel {
        // The type of the filter condition. Valid values:
        // 
        // *   **system**: default filter condition
        // *   **user**: custom filter condition
        @NameInMap("ConditionType")
        public String conditionType;

        // The filter condition. The value of this parameter is in the JSON format and contains the following fields:
        // 
        // *   **filterParams**: the parameters of the filter condition. The value of this field is in the JSON format and contains the following fields:
        // 
        //     *   **labelKey**: the key for rendering.
        // 
        //     *   **label**: the display name.
        // 
        //     *   **value**: the value of the filter condition. The value of this field is in the JSON format and contains the following fields:
        // 
        //         *   **name**: the name of the filter item.
        //         *   **value**: the value of the filter item.
        // 
        // *   **LogicalExp**: the logical relationship among the filter conditions. Valid values:
        // 
        //     *   **AND**: The filter conditions are evaluated by using a logical **AND**.
        //     *   **OR**: The filter conditions are evaluated by using a logical **OR**.
        // 
        // >  If the value of **ConditionType** is **system**, **labelKey** is returned. The labelKey field is used only for internationalization rendering.
        @NameInMap("FilterConditions")
        public String filterConditions;

        // The name of the filter condition.
        @NameInMap("Name")
        public String name;

        // The key of the filter condition name.
        @NameInMap("NameKey")
        public String nameKey;

        public static DescribeSearchConditionResponseBodyConditionList build(java.util.Map<String, ?> map) throws Exception {
            DescribeSearchConditionResponseBodyConditionList self = new DescribeSearchConditionResponseBodyConditionList();
            return TeaModel.build(map, self);
        }

        public DescribeSearchConditionResponseBodyConditionList setConditionType(String conditionType) {
            this.conditionType = conditionType;
            return this;
        }
        public String getConditionType() {
            return this.conditionType;
        }

        public DescribeSearchConditionResponseBodyConditionList setFilterConditions(String filterConditions) {
            this.filterConditions = filterConditions;
            return this;
        }
        public String getFilterConditions() {
            return this.filterConditions;
        }

        public DescribeSearchConditionResponseBodyConditionList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeSearchConditionResponseBodyConditionList setNameKey(String nameKey) {
            this.nameKey = nameKey;
            return this;
        }
        public String getNameKey() {
            return this.nameKey;
        }

    }

}
