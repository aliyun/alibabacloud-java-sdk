// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ListTableMetasRequest extends TeaModel {
    /**
     * <p>The instance ID. You can get this ID by calling the <a href="https://help.aliyun.com/document_detail/2411819.html">ListInstances</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pairec-cn-test1</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The module of the data table. Valid values:</p>
     * <ul>
     * <li><p>ABTest: A/B testing data tables</p>
     * </li>
     * <li><p>ExperimentTool: experiment tool tables</p>
     * </li>
     * <li><p>DataDiagnosis: data diagnosis tables</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ABTest</p>
     */
    @NameInMap("Module")
    public String module;

    /**
     * <p>The table name to filter on.</p>
     * 
     * <strong>example:</strong>
     * <p>test1</p>
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
     * <p>The number of entries to return on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The type of the data table. Valid values:</p>
     * <ul>
     * <li><p>MaxCompute</p>
     * </li>
     * <li><p>Hologres</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>MaxCompute</p>
     */
    @NameInMap("Type")
    public String type;

    public static ListTableMetasRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTableMetasRequest self = new ListTableMetasRequest();
        return TeaModel.build(map, self);
    }

    public ListTableMetasRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListTableMetasRequest setModule(String module) {
        this.module = module;
        return this;
    }
    public String getModule() {
        return this.module;
    }

    public ListTableMetasRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListTableMetasRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListTableMetasRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTableMetasRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
