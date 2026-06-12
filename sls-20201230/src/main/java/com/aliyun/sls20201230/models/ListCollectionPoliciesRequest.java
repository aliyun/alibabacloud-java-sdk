// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListCollectionPoliciesRequest extends TeaModel {
    /**
     * <p>The destination project for centralized data shipping. Specify this parameter to query the number of rules that are configured to ship data to this project.</p>
     * 
     * <strong>example:</strong>
     * <p>your-central-project1</p>
     */
    @NameInMap("centralProject")
    public String centralProject;

    /**
     * <p>The code of the log type.</p>
     * 
     * <strong>example:</strong>
     * <p>access_log</p>
     */
    @NameInMap("dataCode")
    public String dataCode;

    /**
     * <p>The instance ID. Specify this parameter to query rules that match a specific instance. If you use this parameter, you must also specify productCode and dataCode.</p>
     * 
     * <strong>example:</strong>
     * <p>your-test-bucket1</p>
     */
    @NameInMap("instanceId")
    public String instanceId;

    /**
     * <p>The row from which the query starts. Default value: 0.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("offset")
    public Integer offset;

    /**
     * <p>The name of the collection rule.</p>
     * 
     * <strong>example:</strong>
     * <p>your_log_policy</p>
     */
    @NameInMap("policyName")
    public String policyName;

    /**
     * <p>The code of the Alibaba Cloud service.</p>
     * 
     * <strong>example:</strong>
     * <p>oss</p>
     */
    @NameInMap("productCode")
    public String productCode;

    /**
     * <p>The number of collection rules to return on each page. Default value: 50. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("size")
    public Integer size;

    public static ListCollectionPoliciesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCollectionPoliciesRequest self = new ListCollectionPoliciesRequest();
        return TeaModel.build(map, self);
    }

    public ListCollectionPoliciesRequest setCentralProject(String centralProject) {
        this.centralProject = centralProject;
        return this;
    }
    public String getCentralProject() {
        return this.centralProject;
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

    public ListCollectionPoliciesRequest setOffset(Integer offset) {
        this.offset = offset;
        return this;
    }
    public Integer getOffset() {
        return this.offset;
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

    public ListCollectionPoliciesRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

}
