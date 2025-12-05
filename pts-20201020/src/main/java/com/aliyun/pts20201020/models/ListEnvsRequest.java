// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class ListEnvsRequest extends TeaModel {
    /**
     * <p>The ID of the environment. If you specify this parameter, the operation returns the information about the environment identified by the ID.</p>
     * 
     * <strong>example:</strong>
     * <p>10YPA8H</p>
     */
    @NameInMap("EnvId")
    public String envId;

    /**
     * <p>The keyword of the environment name. If you specify this parameter, the operation returns the information about the environments whose names contain the keyword.</p>
     * 
     * <strong>example:</strong>
     * <p>test-create</p>
     */
    @NameInMap("EnvName")
    public String envName;

    /**
     * <p>The page number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of environments per page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListEnvsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEnvsRequest self = new ListEnvsRequest();
        return TeaModel.build(map, self);
    }

    public ListEnvsRequest setEnvId(String envId) {
        this.envId = envId;
        return this;
    }
    public String getEnvId() {
        return this.envId;
    }

    public ListEnvsRequest setEnvName(String envName) {
        this.envName = envName;
        return this;
    }
    public String getEnvName() {
        return this.envName;
    }

    public ListEnvsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListEnvsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
