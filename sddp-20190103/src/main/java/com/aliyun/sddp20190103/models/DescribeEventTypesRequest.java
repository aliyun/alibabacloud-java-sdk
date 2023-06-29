// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeEventTypesRequest extends TeaModel {
    /**
     * <p>The language of the content within the request and response. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The type of anomalous event for which you want to query the anomalous events of subtypes. Valid values:</p>
     * <br>
     * <p>*   **01**: anomalous permission usage</p>
     * <p>*   **02**: anomalous data flow</p>
     * <p>*   **03**: anomalous data operation</p>
     */
    @NameInMap("ParentTypeId")
    public Long parentTypeId;

    /**
     * <p>The type of the resource. Valid values include **1**, **2**, **3**, **4**, and **5**. The value 1 indicates MaxCompute. The value 2 indicates Object Storage Service (OSS). The value 3 indicates AnalyticDB for MySQL. The value 4 indicates Tablestore. The value 5 indicates ApsaraDB RDS.</p>
     */
    @NameInMap("ResourceId")
    public Integer resourceId;

    /**
     * <p>The status of the anomalous event. Valid values:</p>
     * <br>
     * <p>*   **1**: enabled</p>
     * <p>*   **2**: disabled</p>
     */
    @NameInMap("Status")
    public Integer status;

    public static DescribeEventTypesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventTypesRequest self = new DescribeEventTypesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEventTypesRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeEventTypesRequest setParentTypeId(Long parentTypeId) {
        this.parentTypeId = parentTypeId;
        return this;
    }
    public Long getParentTypeId() {
        return this.parentTypeId;
    }

    public DescribeEventTypesRequest setResourceId(Integer resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public Integer getResourceId() {
        return this.resourceId;
    }

    public DescribeEventTypesRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
