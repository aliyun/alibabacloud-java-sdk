// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListCollectionPoliciesRequest extends TeaModel {
    @NameInMap("attribute")
    public ListCollectionPoliciesRequestAttribute attribute;

    @NameInMap("dataCode")
    public String dataCode;

    @NameInMap("instanceId")
    public String instanceId;

    @NameInMap("pageNum")
    public Integer pageNum;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("policyName")
    public String policyName;

    @NameInMap("productCode")
    public String productCode;

    public static ListCollectionPoliciesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCollectionPoliciesRequest self = new ListCollectionPoliciesRequest();
        return TeaModel.build(map, self);
    }

    public ListCollectionPoliciesRequest setAttribute(ListCollectionPoliciesRequestAttribute attribute) {
        this.attribute = attribute;
        return this;
    }
    public ListCollectionPoliciesRequestAttribute getAttribute() {
        return this.attribute;
    }

    public ListCollectionPoliciesRequest setDataCode(String dataCode) {
        this.dataCode = dataCode;
        return this;
    }
    public String getDataCode() {
        return this.dataCode;
    }

    public ListCollectionPoliciesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListCollectionPoliciesRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public ListCollectionPoliciesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCollectionPoliciesRequest setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    public String getPolicyName() {
        return this.policyName;
    }

    public ListCollectionPoliciesRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public static class ListCollectionPoliciesRequestAttribute extends TeaModel {
        @NameInMap("app")
        public String app;

        @NameInMap("policyGroup")
        public String policyGroup;

        public static ListCollectionPoliciesRequestAttribute build(java.util.Map<String, ?> map) throws Exception {
            ListCollectionPoliciesRequestAttribute self = new ListCollectionPoliciesRequestAttribute();
            return TeaModel.build(map, self);
        }

        public ListCollectionPoliciesRequestAttribute setApp(String app) {
            this.app = app;
            return this;
        }
        public String getApp() {
            return this.app;
        }

        public ListCollectionPoliciesRequestAttribute setPolicyGroup(String policyGroup) {
            this.policyGroup = policyGroup;
            return this;
        }
        public String getPolicyGroup() {
            return this.policyGroup;
        }

    }

}
