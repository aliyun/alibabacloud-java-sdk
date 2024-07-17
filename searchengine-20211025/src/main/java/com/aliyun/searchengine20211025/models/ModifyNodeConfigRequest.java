// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ModifyNodeConfigRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable the index.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("active")
    public Boolean active;

    /**
     * <p>The number of data replicas.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("dataDuplicateNumber")
    public Integer dataDuplicateNumber;

    /**
     * <p>The number of data shards.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("dataFragmentNumber")
    public Integer dataFragmentNumber;

    /**
     * <p>The traffic percentage.</p>
     * 
     * <strong>example:</strong>
     * <p>-100</p>
     */
    @NameInMap("flowRatio")
    public Integer flowRatio;

    /**
     * <p>The minimum service ratio.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("minServicePercent")
    public Integer minServicePercent;

    /**
     * <p>Specifies whether to mount the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("published")
    public Boolean published;

    /**
     * <p>The name of the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc_sh_domain_2</p>
     */
    @NameInMap("clusterName")
    public String clusterName;

    /**
     * <p>The name of the data source. Valid values: -search: search for data. -not_search: do not search for data.</p>
     * 
     * <strong>example:</strong>
     * <p>ha-cn-2r42ostoc01_0704</p>
     */
    @NameInMap("dataSourceName")
    public String dataSourceName;

    /**
     * <p>The name of the configuration before the modification.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ha-cn-zvp2iv9a401_qrs</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The type of the algorithm. Valid values:</p>
     * <ul>
     * <li>pop: a popularity model.</li>
     * <li>cp: a category prediction model.</li>
     * <li>hot: a top search model.</li>
     * <li>hint: a hint model.</li>
     * <li>suggest: a drop-down suggestions model.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot; &quot;</p>
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

    public ModifyNodeConfigRequest setFlowRatio(Integer flowRatio) {
        this.flowRatio = flowRatio;
        return this;
    }
    public Integer getFlowRatio() {
        return this.flowRatio;
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
