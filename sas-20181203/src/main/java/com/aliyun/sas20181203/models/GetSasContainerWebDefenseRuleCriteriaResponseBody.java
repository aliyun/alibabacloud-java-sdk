// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetSasContainerWebDefenseRuleCriteriaResponseBody extends TeaModel {
    /**
     * <p>The search conditions.</p>
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
         * <p>The name of the search condition.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The type of the search condition. Valid values:</p>
         * <ul>
         * <li><strong>input</strong>: You must manually enter the search condition.</li>
         * <li><strong>select</strong>: You must select a search condition from the <strong>Values</strong> drop-down list.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>select</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The values of the search condition. This parameter is returned only if the value of <strong>Type</strong> is <strong>select</strong>.</p>
         * <blockquote>
         * <p> If the value of <strong>Type</strong> is <strong>input</strong>, the value of this parameter is empty.</p>
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
