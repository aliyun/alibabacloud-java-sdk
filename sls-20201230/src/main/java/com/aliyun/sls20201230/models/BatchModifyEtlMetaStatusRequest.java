// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class BatchModifyEtlMetaStatusRequest extends TeaModel {
    // 当 range 的值为 "list" 时有效，匹配list中的 metaKey
    @NameInMap("etlMetaKeyList")
    public java.util.List<String> etlMetaKeyList;

    @NameInMap("etlMetaName")
    public String etlMetaName;

    // 匹配的 tag，当 tag 为 "__all_etl_meta_tag_match__" 时表示全部匹配。
    @NameInMap("etlMetaTag")
    public String etlMetaTag;

    // 操作作用的范围，可选 all 代表匹配全部，list 按名单列表匹配 key 两种模式。
    @NameInMap("range")
    public String range;

    // 操作类型，支持启用、禁用、删除三种，即 batch_enable、batch_disable、batch_delete。
    @NameInMap("type")
    public String type;

    public static BatchModifyEtlMetaStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchModifyEtlMetaStatusRequest self = new BatchModifyEtlMetaStatusRequest();
        return TeaModel.build(map, self);
    }

    public BatchModifyEtlMetaStatusRequest setEtlMetaKeyList(java.util.List<String> etlMetaKeyList) {
        this.etlMetaKeyList = etlMetaKeyList;
        return this;
    }
    public java.util.List<String> getEtlMetaKeyList() {
        return this.etlMetaKeyList;
    }

    public BatchModifyEtlMetaStatusRequest setEtlMetaName(String etlMetaName) {
        this.etlMetaName = etlMetaName;
        return this;
    }
    public String getEtlMetaName() {
        return this.etlMetaName;
    }

    public BatchModifyEtlMetaStatusRequest setEtlMetaTag(String etlMetaTag) {
        this.etlMetaTag = etlMetaTag;
        return this;
    }
    public String getEtlMetaTag() {
        return this.etlMetaTag;
    }

    public BatchModifyEtlMetaStatusRequest setRange(String range) {
        this.range = range;
        return this;
    }
    public String getRange() {
        return this.range;
    }

    public BatchModifyEtlMetaStatusRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
