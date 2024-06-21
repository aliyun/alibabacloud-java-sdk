// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetStackResourceRequest extends TeaModel {
    /**
     * <p>Specifies whether to query the resource properties. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The name of resource property N that you want to query.</p>
     * <blockquote>
     * <p> Maximum value of N: 20.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>WebServer</p>
     */
    @NameInMap("LogicalResourceId")
    public String logicalResourceId;

    /**
     * <p>The logical ID of the resource defined in the template.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The status of the resource. Valid values:</p>
     * <ul>
     * <li>CREATE_COMPLETE</li>
     * <li>CREATE_FAILED</li>
     * <li>CREATE_IN_PROGRESS</li>
     * <li>UPDATE_IN_PROGRESS</li>
     * <li>UPDATE_FAILED</li>
     * <li>UPDATE_COMPLETE</li>
     * <li>DELETE_IN_PROGRESS</li>
     * <li>DELETE_FAILED</li>
     * <li>CHECK_IN_PROGRESS</li>
     * <li>CHECK_FAILED</li>
     * <li>CHECK_COMPLETE</li>
     * <li>IMPORT_IN_PROGRESS</li>
     * <li>IMPORT_FAILED</li>
     * <li>IMPORT_COMPLETE</li>
     * </ul>
     */
    @NameInMap("ResourceAttributes")
    public java.util.List<String> resourceAttributes;

    /**
     * <p>The name of resource property N that you want to query.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ShowResourceAttributes")
    public Boolean showResourceAttributes;

    /**
     * <p>The ID of the region to which the stack belongs. You can call the <a href="https://help.aliyun.com/document_detail/131035.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4a6c9851-3b0f-4f5f-b4ca-a14bf691****</p>
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
