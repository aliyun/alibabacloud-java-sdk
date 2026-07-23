// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class GetInstanceResourceResponseBody extends TeaModel {
    /**
     * <p>The resource category. Valid values:</p>
     * <ul>
     * <li><p>DataManagement</p>
     * </li>
     * <li><p>Engine</p>
     * </li>
     * <li><p>Monitor</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DataManagement</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>The resource configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-10-13 17:34:52</p>
     */
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    /**
     * <p>The last modification time.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-10-13 17:34:52</p>
     */
    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    /**
     * <p>The resource group.</p>
     * <p>If <code>Category</code> is <code>DataManagement</code>, the valid values are:</p>
     * <ul>
     * <li><p>storage</p>
     * </li>
     * <li><p>modelpipeline</p>
     * </li>
     * <li><p>datastorage</p>
     * </li>
     * <li><p>modeltrain</p>
     * </li>
     * </ul>
     * <p>If <code>Category</code> is <code>Engine</code>, the valid values are:</p>
     * <ul>
     * <li><p>feature</p>
     * </li>
     * <li><p>predict</p>
     * </li>
     * <li><p>recall</p>
     * </li>
     * <li><p>recengine</p>
     * </li>
     * </ul>
     * <p>If <code>Category</code> is <code>Monitor</code>, the valid values are:</p>
     * <ul>
     * <li><p>logs</p>
     * </li>
     * <li><p>logsback</p>
     * </li>
     * <li><p>coldstart</p>
     * </li>
     * <li><p>deploy</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>storage</p>
     */
    @NameInMap("Group")
    public String group;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D75C43DC-3D3A-5CC8-9AAC-8C77306C433B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The resource ID.</p>
     * 
     * <strong>example:</strong>
     * <p>reso-2s416t***</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>The resource type. Valid values:</p>
     * <ul>
     * <li><p>Hologres</p>
     * </li>
     * <li><p>EAS</p>
     * </li>
     * <li><p>BE</p>
     * </li>
     * <li><p>Rec</p>
     * </li>
     * <li><p>Platform</p>
     * </li>
     * <li><p>SLS</p>
     * </li>
     * <li><p>DataHub</p>
     * </li>
     * <li><p>ApsaraMQ for Kafka</p>
     * </li>
     * <li><p>Realtime Compute for Apache Flink</p>
     * </li>
     * <li><p>ACR</p>
     * </li>
     * <li><p>OSS</p>
     * </li>
     * <li><p>DataWorks</p>
     * </li>
     * <li><p>PAI</p>
     * </li>
     * <li><p>MaxCompute</p>
     * </li>
     * <li><p>Graph Compute Service</p>
     * </li>
     * <li><p>ApsaraDB for Redis</p>
     * </li>
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
