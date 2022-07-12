// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListEtlMetaRequest extends TeaModel {
    @NameInMap("etlMetaKey")
    public String etlMetaKey;

    @NameInMap("etlMetaName")
    public String etlMetaName;

    @NameInMap("etlMetaTag")
    public String etlMetaTag;

    // 默认值 0。
    @NameInMap("offset")
    public Integer offset;

    // 默认值 200.
    @NameInMap("size")
    public Integer size;

    public static ListEtlMetaRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEtlMetaRequest self = new ListEtlMetaRequest();
        return TeaModel.build(map, self);
    }

    public ListEtlMetaRequest setEtlMetaKey(String etlMetaKey) {
        this.etlMetaKey = etlMetaKey;
        return this;
    }
    public String getEtlMetaKey() {
        return this.etlMetaKey;
    }

    public ListEtlMetaRequest setEtlMetaName(String etlMetaName) {
        this.etlMetaName = etlMetaName;
        return this;
    }
    public String getEtlMetaName() {
        return this.etlMetaName;
    }

    public ListEtlMetaRequest setEtlMetaTag(String etlMetaTag) {
        this.etlMetaTag = etlMetaTag;
        return this;
    }
    public String getEtlMetaTag() {
        return this.etlMetaTag;
    }

    public ListEtlMetaRequest setOffset(Integer offset) {
        this.offset = offset;
        return this;
    }
    public Integer getOffset() {
        return this.offset;
    }

    public ListEtlMetaRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

}
