// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class ListVpcConfigsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>05AHW</p>
     */
    @NameInMap("ConfigId")
    public String configId;

    /**
     * <strong>example:</strong>
     * <p>my-vpc-config-info</p>
     */
    @NameInMap("ConfigName")
    public String configName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>vpc-bp11w3qellkjwnhqxzmt2</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static ListVpcConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListVpcConfigsRequest self = new ListVpcConfigsRequest();
        return TeaModel.build(map, self);
    }

    public ListVpcConfigsRequest setConfigId(String configId) {
        this.configId = configId;
        return this;
    }
    public String getConfigId() {
        return this.configId;
    }

    public ListVpcConfigsRequest setConfigName(String configName) {
        this.configName = configName;
        return this;
    }
    public String getConfigName() {
        return this.configName;
    }

    public ListVpcConfigsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListVpcConfigsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListVpcConfigsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListVpcConfigsRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
