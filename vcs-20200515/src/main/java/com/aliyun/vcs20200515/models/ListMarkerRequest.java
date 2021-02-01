// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class ListMarkerRequest extends TeaModel {
    @NameInMap("AlgorithmId")
    public String algorithmId;

    @NameInMap("SampleId")
    public String sampleId;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("PageNum")
    public String pageNum;

    public static ListMarkerRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMarkerRequest self = new ListMarkerRequest();
        return TeaModel.build(map, self);
    }

    public ListMarkerRequest setAlgorithmId(String algorithmId) {
        this.algorithmId = algorithmId;
        return this;
    }
    public String getAlgorithmId() {
        return this.algorithmId;
    }

    public ListMarkerRequest setSampleId(String sampleId) {
        this.sampleId = sampleId;
        return this;
    }
    public String getSampleId() {
        return this.sampleId;
    }

    public ListMarkerRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListMarkerRequest setPageNum(String pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public String getPageNum() {
        return this.pageNum;
    }

}
