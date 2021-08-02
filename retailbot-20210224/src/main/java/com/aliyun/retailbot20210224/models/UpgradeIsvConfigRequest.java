// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class UpgradeIsvConfigRequest extends TeaModel {
    @NameInMap("AliyunAccountDTO")
    public UpgradeIsvConfigRequestAliyunAccountDTO aliyunAccountDTO;

    @NameInMap("VersionId")
    public Long versionId;

    public static UpgradeIsvConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpgradeIsvConfigRequest self = new UpgradeIsvConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpgradeIsvConfigRequest setAliyunAccountDTO(UpgradeIsvConfigRequestAliyunAccountDTO aliyunAccountDTO) {
        this.aliyunAccountDTO = aliyunAccountDTO;
        return this;
    }
    public UpgradeIsvConfigRequestAliyunAccountDTO getAliyunAccountDTO() {
        return this.aliyunAccountDTO;
    }

    public UpgradeIsvConfigRequest setVersionId(Long versionId) {
        this.versionId = versionId;
        return this;
    }
    public Long getVersionId() {
        return this.versionId;
    }

    public static class UpgradeIsvConfigRequestAliyunAccountDTO extends TeaModel {
        @NameInMap("AliUid")
        public Long aliUid;

        public static UpgradeIsvConfigRequestAliyunAccountDTO build(java.util.Map<String, ?> map) throws Exception {
            UpgradeIsvConfigRequestAliyunAccountDTO self = new UpgradeIsvConfigRequestAliyunAccountDTO();
            return TeaModel.build(map, self);
        }

        public UpgradeIsvConfigRequestAliyunAccountDTO setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

    }

}
