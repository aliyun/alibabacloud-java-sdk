// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ModifyNodeConfigRequest extends TeaModel {
    @NameInMap("active")
    public Boolean active;

    @NameInMap("dataDuplicateNumber")
    public Integer dataDuplicateNumber;

    @NameInMap("dataFragmentNumber")
    public Integer dataFragmentNumber;

    @NameInMap("minServicePercent")
    public Integer minServicePercent;

    @NameInMap("published")
    public Boolean published;

    /**
     * <p>The ID of the cluster.</p>
     */
    @NameInMap("clusterName")
    public String clusterName;

    /**
     * <p>The parameters in the request body.</p>
     */
    @NameInMap("dataSourceName")
    public String dataSourceName;

    /**
     * <p>The name of the cluster.</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The original name of the node.</p>
     */
    @NameInMap("type")
    public String type;

    public static ModifyNodeConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyNodeConfigRequest self = new ModifyNodeConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifyNodeConfigRequest setActive(Boolean active) {
        this.active = active;
        return this;
    }
    public Boolean getActive() {
        return this.active;
    }

    public ModifyNodeConfigRequest setDataDuplicateNumber(Integer dataDuplicateNumber) {
        this.dataDuplicateNumber = dataDuplicateNumber;
        return this;
    }
    public Integer getDataDuplicateNumber() {
        return this.dataDuplicateNumber;
    }

    public ModifyNodeConfigRequest setDataFragmentNumber(Integer dataFragmentNumber) {
        this.dataFragmentNumber = dataFragmentNumber;
        return this;
    }
    public Integer getDataFragmentNumber() {
        return this.dataFragmentNumber;
    }

    public ModifyNodeConfigRequest setMinServicePercent(Integer minServicePercent) {
        this.minServicePercent = minServicePercent;
        return this;
    }
    public Integer getMinServicePercent() {
        return this.minServicePercent;
    }

    public ModifyNodeConfigRequest setPublished(Boolean published) {
        this.published = published;
        return this;
    }
    public Boolean getPublished() {
        return this.published;
    }

    public ModifyNodeConfigRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public ModifyNodeConfigRequest setDataSourceName(String dataSourceName) {
        this.dataSourceName = dataSourceName;
        return this;
    }
    public String getDataSourceName() {
        return this.dataSourceName;
    }

    public ModifyNodeConfigRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyNodeConfigRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
