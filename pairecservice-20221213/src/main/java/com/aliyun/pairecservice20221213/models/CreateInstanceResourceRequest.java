// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CreateInstanceResourceRequest extends TeaModel {
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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DataManagement</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>The resource group.</p>
     * <p>If the resource category is DataManagement, valid values are:</p>
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
     * <p>If the resource category is Engine, valid values are:</p>
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
     * <p>If the resource category is Monitor, valid values are:</p>
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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>storage</p>
     */
    @NameInMap("Group")
    public String group;

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
     * <li><p>Graph Compute</p>
     * </li>
     * <li><p>ApsaraDB for Redis</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>OSS</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The resource URI.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bucket-test-123</p>
     */
    @NameInMap("Uri")
    public String uri;

    public static CreateInstanceResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceResourceRequest self = new CreateInstanceResourceRequest();
        return TeaModel.build(map, self);
    }

    public CreateInstanceResourceRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public CreateInstanceResourceRequest setGroup(String group) {
        this.group = group;
        return this;
    }
    public String getGroup() {
        return this.group;
    }

    public CreateInstanceResourceRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateInstanceResourceRequest setUri(String uri) {
        this.uri = uri;
        return this;
    }
    public String getUri() {
        return this.uri;
    }

}
