// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetKMSServiceKeyResponseBody extends TeaModel {
    @NameInMap("KmsKeyInfoList")
    public java.util.List<GetKMSServiceKeyResponseBodyKmsKeyInfoList> kmsKeyInfoList;

    @NameInMap("RequestId")
    public String requestId;

    public static GetKMSServiceKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetKMSServiceKeyResponseBody self = new GetKMSServiceKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetKMSServiceKeyResponseBody setKmsKeyInfoList(java.util.List<GetKMSServiceKeyResponseBodyKmsKeyInfoList> kmsKeyInfoList) {
        this.kmsKeyInfoList = kmsKeyInfoList;
        return this;
    }
    public java.util.List<GetKMSServiceKeyResponseBodyKmsKeyInfoList> getKmsKeyInfoList() {
        return this.kmsKeyInfoList;
    }

    public GetKMSServiceKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetKMSServiceKeyResponseBodyKmsKeyInfoList extends TeaModel {
        @NameInMap("Arn")
        public String arn;

        @NameInMap("CreationDate")
        public String creationDate;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("DeleteDate")
        public String deleteDate;

        @NameInMap("Description")
        public String description;

        @NameInMap("KeyId")
        public String keyId;

        @NameInMap("KeyState")
        public String keyState;

        @NameInMap("KeyUsage")
        public String keyUsage;

        public static GetKMSServiceKeyResponseBodyKmsKeyInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetKMSServiceKeyResponseBodyKmsKeyInfoList self = new GetKMSServiceKeyResponseBodyKmsKeyInfoList();
            return TeaModel.build(map, self);
        }

        public GetKMSServiceKeyResponseBodyKmsKeyInfoList setArn(String arn) {
            this.arn = arn;
            return this;
        }
        public String getArn() {
            return this.arn;
        }

        public GetKMSServiceKeyResponseBodyKmsKeyInfoList setCreationDate(String creationDate) {
            this.creationDate = creationDate;
            return this;
        }
        public String getCreationDate() {
            return this.creationDate;
        }

        public GetKMSServiceKeyResponseBodyKmsKeyInfoList setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public GetKMSServiceKeyResponseBodyKmsKeyInfoList setDeleteDate(String deleteDate) {
            this.deleteDate = deleteDate;
            return this;
        }
        public String getDeleteDate() {
            return this.deleteDate;
        }

        public GetKMSServiceKeyResponseBodyKmsKeyInfoList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetKMSServiceKeyResponseBodyKmsKeyInfoList setKeyId(String keyId) {
            this.keyId = keyId;
            return this;
        }
        public String getKeyId() {
            return this.keyId;
        }

        public GetKMSServiceKeyResponseBodyKmsKeyInfoList setKeyState(String keyState) {
            this.keyState = keyState;
            return this;
        }
        public String getKeyState() {
            return this.keyState;
        }

        public GetKMSServiceKeyResponseBodyKmsKeyInfoList setKeyUsage(String keyUsage) {
            this.keyUsage = keyUsage;
            return this;
        }
        public String getKeyUsage() {
            return this.keyUsage;
        }

    }

}
