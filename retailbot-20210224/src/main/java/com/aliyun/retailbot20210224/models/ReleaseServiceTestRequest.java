// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class ReleaseServiceTestRequest extends TeaModel {
    // A short description of struct
    @NameInMap("AliyunAccountDTO")
    public ReleaseServiceTestRequestAliyunAccountDTO aliyunAccountDTO;

    public static ReleaseServiceTestRequest build(java.util.Map<String, ?> map) throws Exception {
        ReleaseServiceTestRequest self = new ReleaseServiceTestRequest();
        return TeaModel.build(map, self);
    }

    public ReleaseServiceTestRequest setAliyunAccountDTO(ReleaseServiceTestRequestAliyunAccountDTO aliyunAccountDTO) {
        this.aliyunAccountDTO = aliyunAccountDTO;
        return this;
    }
    public ReleaseServiceTestRequestAliyunAccountDTO getAliyunAccountDTO() {
        return this.aliyunAccountDTO;
    }

    public static class ReleaseServiceTestRequestAliyunAccountDTO extends TeaModel {
        @NameInMap("AliUid")
        public Long aliUid;

        public static ReleaseServiceTestRequestAliyunAccountDTO build(java.util.Map<String, ?> map) throws Exception {
            ReleaseServiceTestRequestAliyunAccountDTO self = new ReleaseServiceTestRequestAliyunAccountDTO();
            return TeaModel.build(map, self);
        }

        public ReleaseServiceTestRequestAliyunAccountDTO setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

    }

}
