// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ListEngineConfigsRequest extends TeaModel {
    /**
     * <p>The environment. Valid values:</p>
     * <ul>
     * <li><p><strong>Daily</strong>: the development and test environment.</p>
     * </li>
     * <li><p><strong>Pre</strong>: the pre-production environment.</p>
     * </li>
     * <li><p><strong>Prod</strong>: the production environment.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Pre</p>
     */
    @NameInMap("Environment")
    public String environment;

    /**
     * <p>The instance ID. To obtain this ID, call the <a href="https://help.aliyun.com/document_detail/2411819.html">ListInstances</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pairec-cn-***test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The name of the engine configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>engine_config_v1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The page size.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The status to filter by. Valid values:</p>
     * <ul>
     * <li><p><strong>Released</strong>: returns only released configurations.</p>
     * </li>
     * <li><p><strong>Unreleased</strong>: returns only unreleased configurations.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Released</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The version to filter by.</p>
     * <p>Set this parameter to <code>latest</code> to retrieve the most recently updated version.</p>
     * 
     * <strong>example:</strong>
     * <p>latest</p>
     */
    @NameInMap("Version")
    public String version;

    public static ListEngineConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEngineConfigsRequest self = new ListEngineConfigsRequest();
        return TeaModel.build(map, self);
    }

    public ListEngineConfigsRequest setEnvironment(String environment) {
        this.environment = environment;
        return this;
    }
    public String getEnvironment() {
        return this.environment;
    }

    public ListEngineConfigsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListEngineConfigsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListEngineConfigsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListEngineConfigsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListEngineConfigsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListEngineConfigsRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
