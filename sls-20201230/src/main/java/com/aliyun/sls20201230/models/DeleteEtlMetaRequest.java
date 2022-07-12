// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class DeleteEtlMetaRequest extends TeaModel {
    // key。由 ascii 可打印字符组成，包括数字、英文大小写字母、下划线、连字符、英文标点符号等组成，长度在[1,255]之间。
    @NameInMap("etlMetaKey")
    public String etlMetaKey;

    // 名字。由数字、大小写字母、下划线_、连字符-组成，长度需要在[2,64]之间。
    @NameInMap("etlMetaName")
    public String etlMetaName;

    // 此处固定为 "__all_etl_meta_tag_match__"
    @NameInMap("etlMetaTag")
    public String etlMetaTag;

    public static DeleteEtlMetaRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteEtlMetaRequest self = new DeleteEtlMetaRequest();
        return TeaModel.build(map, self);
    }

    public DeleteEtlMetaRequest setEtlMetaKey(String etlMetaKey) {
        this.etlMetaKey = etlMetaKey;
        return this;
    }
    public String getEtlMetaKey() {
        return this.etlMetaKey;
    }

    public DeleteEtlMetaRequest setEtlMetaName(String etlMetaName) {
        this.etlMetaName = etlMetaName;
        return this;
    }
    public String getEtlMetaName() {
        return this.etlMetaName;
    }

    public DeleteEtlMetaRequest setEtlMetaTag(String etlMetaTag) {
        this.etlMetaTag = etlMetaTag;
        return this;
    }
    public String getEtlMetaTag() {
        return this.etlMetaTag;
    }

}
