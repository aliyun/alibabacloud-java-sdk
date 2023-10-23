// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListCollectionPoliciesShrinkRequest extends TeaModel {
    @NameInMap("attribute")
    public String attributeShrink;

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

    public static ListCollectionPoliciesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCollectionPoliciesShrinkRequest self = new ListCollectionPoliciesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListCollectionPoliciesShrinkRequest setAttributeShrink(String attributeShrink) {
        this.attributeShrink = attributeShrink;
        return this;
    }
    public String getAttributeShrink() {
        return this.attributeShrink;
    }

    public ListCollectionPoliciesShrinkRequest setDataCode(String dataCode) {
        this.dataCode = dataCode;
        return this;
    }
    public String getDataCode() {
        return this.dataCode;
    }

    public ListCollectionPoliciesShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListCollectionPoliciesShrinkRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public ListCollectionPoliciesShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCollectionPoliciesShrinkRequest setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    public String getPolicyName() {
        return this.policyName;
    }

    public ListCollectionPoliciesShrinkRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

}
