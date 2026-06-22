// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetSasContainerWebDefenseRuleCriteriaResponseBody extends TeaModel {
    /**
     * <p>The list of query criteria.</p>
     */
    @NameInMap("CriteriaList")
    public java.util.List<GetSasContainerWebDefenseRuleCriteriaResponseBodyCriteriaList> criteriaList;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F8B6F758-BCD4-597A-8A2C-DA5A552C****</p>
     */
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
        /**
         * <p>The name of the query criterion.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The type of the query criterion. Valid values:</p>
         * <ul>
         * <li><strong>input</strong>: Input type. You must manually enter the query content when using this query criterion.</li>
         * <li><strong>select</strong>: Selection type. You must select a value from the options list (the <strong>Values</strong> field) when using this query criterion.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>select</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The available options when <strong>Type</strong> (the type of the query criterion) is set to <strong>select</strong> (selection type).</p>
         * <blockquote>
         * <p>When <strong>Type</strong> (the type of the query criterion) is set to <strong>input</strong> (input type), this parameter returns an empty value.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>athor_bid</p>
         */
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
