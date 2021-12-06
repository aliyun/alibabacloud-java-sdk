// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class AdminTestSeviceRequest extends TeaModel {
    @NameInMap("AliyunAccountDTO")
    public AdminTestSeviceRequestAliyunAccountDTO aliyunAccountDTO;

    @NameInMap("VersionId")
    public Long versionId;

    public static AdminTestSeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        AdminTestSeviceRequest self = new AdminTestSeviceRequest();
        return TeaModel.build(map, self);
    }

    public AdminTestSeviceRequest setAliyunAccountDTO(AdminTestSeviceRequestAliyunAccountDTO aliyunAccountDTO) {
        this.aliyunAccountDTO = aliyunAccountDTO;
        return this;
    }
    public AdminTestSeviceRequestAliyunAccountDTO getAliyunAccountDTO() {
        return this.aliyunAccountDTO;
    }

    public AdminTestSeviceRequest setVersionId(Long versionId) {
        this.versionId = versionId;
        return this;
    }
    public Long getVersionId() {
        return this.versionId;
    }

    public static class AdminTestSeviceRequestAliyunAccountDTO extends TeaModel {
        @NameInMap("AliUid")
        public Long aliUid;

        public static AdminTestSeviceRequestAliyunAccountDTO build(java.util.Map<String, ?> map) throws Exception {
            AdminTestSeviceRequestAliyunAccountDTO self = new AdminTestSeviceRequestAliyunAccountDTO();
            return TeaModel.build(map, self);
        }

        public AdminTestSeviceRequestAliyunAccountDTO setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

    }

}
