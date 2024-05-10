// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetStackResourceRequest extends TeaModel {
    /**
     * <p>Specifies whether to query the resource properties. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The name of resource property N that you want to query.</p>
     * <br>
     * <p>>  Maximum value of N: 20.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("LogicalResourceId")
    public String logicalResourceId;

    /**
     * <p>The logical ID of the resource defined in the template.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The status of the resource. Valid values:</p>
     * <br>
     * <p>*   CREATE_COMPLETE</p>
     * <p>*   CREATE_FAILED</p>
     * <p>*   CREATE_IN_PROGRESS</p>
     * <p>*   UPDATE_IN_PROGRESS</p>
     * <p>*   UPDATE_FAILED</p>
     * <p>*   UPDATE_COMPLETE</p>
     * <p>*   DELETE_IN_PROGRESS</p>
     * <p>*   DELETE_FAILED</p>
     * <p>*   CHECK_IN_PROGRESS</p>
     * <p>*   CHECK_FAILED</p>
     * <p>*   CHECK_COMPLETE</p>
     * <p>*   IMPORT_IN_PROGRESS</p>
     * <p>*   IMPORT_FAILED</p>
     * <p>*   IMPORT_COMPLETE</p>
     */
    @NameInMap("ResourceAttributes")
    public java.util.List<String> resourceAttributes;

    /**
     * <p>The name of resource property N that you want to query.</p>
     */
    @NameInMap("ShowResourceAttributes")
    public Boolean showResourceAttributes;

    /**
     * <p>The ID of the region to which the stack belongs. You can call the [DescribeRegions](https://help.aliyun.com/document_detail/131035.html) operation to query the most recent region list.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("StackId")
    public String stackId;

    public static GetStackResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetStackResourceRequest self = new GetStackResourceRequest();
        return TeaModel.build(map, self);
    }

    public GetStackResourceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public GetStackResourceRequest setLogicalResourceId(String logicalResourceId) {
        this.logicalResourceId = logicalResourceId;
        return this;
    }
    public String getLogicalResourceId() {
        return this.logicalResourceId;
    }

    public GetStackResourceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetStackResourceRequest setResourceAttributes(java.util.List<String> resourceAttributes) {
        this.resourceAttributes = resourceAttributes;
        return this;
    }
    public java.util.List<String> getResourceAttributes() {
        return this.resourceAttributes;
    }

    public GetStackResourceRequest setShowResourceAttributes(Boolean showResourceAttributes) {
        this.showResourceAttributes = showResourceAttributes;
        return this;
    }
    public Boolean getShowResourceAttributes() {
        return this.showResourceAttributes;
    }

    public GetStackResourceRequest setStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }
    public String getStackId() {
        return this.stackId;
    }

}
