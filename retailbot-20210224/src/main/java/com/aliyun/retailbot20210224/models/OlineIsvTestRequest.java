// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class OlineIsvTestRequest extends TeaModel {
    // A short description of struct
    @NameInMap("AliyunAccountDTO")
    public OlineIsvTestRequestAliyunAccountDTO aliyunAccountDTO;

    @NameInMap("VersionId")
    public Long versionId;

    public static OlineIsvTestRequest build(java.util.Map<String, ?> map) throws Exception {
        OlineIsvTestRequest self = new OlineIsvTestRequest();
        return TeaModel.build(map, self);
    }

    public OlineIsvTestRequest setAliyunAccountDTO(OlineIsvTestRequestAliyunAccountDTO aliyunAccountDTO) {
        this.aliyunAccountDTO = aliyunAccountDTO;
        return this;
    }
    public OlineIsvTestRequestAliyunAccountDTO getAliyunAccountDTO() {
        return this.aliyunAccountDTO;
    }

    public OlineIsvTestRequest setVersionId(Long versionId) {
        this.versionId = versionId;
        return this;
    }
    public Long getVersionId() {
        return this.versionId;
    }

    public static class OlineIsvTestRequestAliyunAccountDTO extends TeaModel {
        @NameInMap("AliUid")
        public Long aliUid;

        public static OlineIsvTestRequestAliyunAccountDTO build(java.util.Map<String, ?> map) throws Exception {
            OlineIsvTestRequestAliyunAccountDTO self = new OlineIsvTestRequestAliyunAccountDTO();
            return TeaModel.build(map, self);
        }

        public OlineIsvTestRequestAliyunAccountDTO setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

    }

}
