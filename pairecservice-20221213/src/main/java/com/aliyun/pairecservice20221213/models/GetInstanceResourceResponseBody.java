// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class GetInstanceResourceResponseBody extends TeaModel {
    /**
     * <p>The resource category. Valid values:</p>
     * <ul>
     * <li>DataManagement</li>
     * <li>Engine</li>
     * <li>Monitor</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DataManagement</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>The configuration information of the resource.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The creation time. The time is in the YYYY-MM-DD HH:mm:ss format.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-10-13 17:34:52</p>
     */
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    /**
     * <p>The update time. The time is in the YYYY-MM-DD HH:mm:ss format.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-10-13 17:34:52</p>
     */
    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    /**
     * <p>The resource group.</p>
     * <p>If the resource category is DataManagement, valid values are:</p>
     * <ul>
     * <li>storage</li>
     * <li>modelpipeline</li>
     * <li>datastorage</li>
     * <li>modeltrain</li>
     * </ul>
     * <p>If the resource category is Engine, valid values are:</p>
     * <ul>
     * <li>feature</li>
     * <li>predict</li>
     * <li>recall</li>
     * <li>recengine</li>
     * </ul>
     * <p>If the resource category is Monitor, valid values are:</p>
     * <ul>
     * <li>logs</li>
     * <li>logsback</li>
     * <li>coldstart</li>
     * <li>deploy</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>storage</p>
     */
    @NameInMap("Group")
    public String group;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>D75C43DC-3D3A-5CC8-9AAC-8C77306C433B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the resource.</p>
     * 
     * <strong>example:</strong>
     * <p>reso-2s416t***</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>The resource type. Valid values:</p>
     * <ul>
     * <li>Hologres</li>
     * <li>EAS</li>
     * <li>BE</li>
     * <li>Rec</li>
     * <li>Platform</li>
     * <li>SLS</li>
     * <li>DataHub</li>
     * <li>Kafka</li>
     * <li>Flinkvvp</li>
     * <li>ACR</li>
     * <li>OSS</li>
     * <li>DataWorks</li>
     * <li>PAI</li>
     * <li>MaxCompute</li>
     * <li>GraphCompute</li>
     * <li>Redis</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OSS</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The resource URI.</p>
     * 
     * <strong>example:</strong>
     * <p>bucket-test-123</p>
     */
    @NameInMap("Uri")
    public String uri;

    public static GetInstanceResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceResourceResponseBody self = new GetInstanceResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceResourceResponseBody setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public GetInstanceResourceResponseBody setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public GetInstanceResourceResponseBody setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public GetInstanceResourceResponseBody setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    public GetInstanceResourceResponseBody setGroup(String group) {
        this.group = group;
        return this;
    }
    public String getGroup() {
        return this.group;
    }

    public GetInstanceResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetInstanceResourceResponseBody setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public GetInstanceResourceResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public GetInstanceResourceResponseBody setUri(String uri) {
        this.uri = uri;
        return this;
    }
    public String getUri() {
        return this.uri;
    }

}
