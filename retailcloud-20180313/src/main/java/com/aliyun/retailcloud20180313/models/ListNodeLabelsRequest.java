// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class ListNodeLabelsRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("LabelKey")
    public String labelKey;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListNodeLabelsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListNodeLabelsRequest self = new ListNodeLabelsRequest();
        return TeaModel.build(map, self);
    }

    public ListNodeLabelsRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListNodeLabelsRequest setLabelKey(String labelKey) {
        this.labelKey = labelKey;
        return this;
    }
    public String getLabelKey() {
        return this.labelKey;
    }

    public ListNodeLabelsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListNodeLabelsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
