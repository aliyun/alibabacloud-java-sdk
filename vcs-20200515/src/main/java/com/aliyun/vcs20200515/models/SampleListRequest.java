// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class SampleListRequest extends TeaModel {
    @NameInMap("AlgorithmId")
    public String algorithmId;

    @NameInMap("LabelId")
    public String labelId;

    @NameInMap("IsMarker")
    public String isMarker;

    @NameInMap("Type")
    public String type;

    @NameInMap("Usages")
    public String usages;

    @NameInMap("PageNum")
    public Long pageNum;

    @NameInMap("PageSize")
    public Long pageSize;

    public static SampleListRequest build(java.util.Map<String, ?> map) throws Exception {
        SampleListRequest self = new SampleListRequest();
        return TeaModel.build(map, self);
    }

    public SampleListRequest setAlgorithmId(String algorithmId) {
        this.algorithmId = algorithmId;
        return this;
    }
    public String getAlgorithmId() {
        return this.algorithmId;
    }

    public SampleListRequest setLabelId(String labelId) {
        this.labelId = labelId;
        return this;
    }
    public String getLabelId() {
        return this.labelId;
    }

    public SampleListRequest setIsMarker(String isMarker) {
        this.isMarker = isMarker;
        return this;
    }
    public String getIsMarker() {
        return this.isMarker;
    }

    public SampleListRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public SampleListRequest setUsages(String usages) {
        this.usages = usages;
        return this;
    }
    public String getUsages() {
        return this.usages;
    }

    public SampleListRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public SampleListRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
