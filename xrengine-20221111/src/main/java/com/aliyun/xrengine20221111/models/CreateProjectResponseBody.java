// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20221111.models;

import com.aliyun.tea.*;

public class CreateProjectResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreateProjectResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateProjectResponseBody self = new CreateProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateProjectResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateProjectResponseBody setData(CreateProjectResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateProjectResponseBodyData getData() {
        return this.data;
    }

    public CreateProjectResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateProjectResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateProjectResponseBodyDataDatasetPolicy extends TeaModel {
        @NameInMap("AccessId")
        public String accessId;

        @NameInMap("Dir")
        public String dir;

        @NameInMap("Expire")
        public String expire;

        @NameInMap("Host")
        public String host;

        @NameInMap("Policy")
        public String policy;

        @NameInMap("Signature")
        public String signature;

        public static CreateProjectResponseBodyDataDatasetPolicy build(java.util.Map<String, ?> map) throws Exception {
            CreateProjectResponseBodyDataDatasetPolicy self = new CreateProjectResponseBodyDataDatasetPolicy();
            return TeaModel.build(map, self);
        }

        public CreateProjectResponseBodyDataDatasetPolicy setAccessId(String accessId) {
            this.accessId = accessId;
            return this;
        }
        public String getAccessId() {
            return this.accessId;
        }

        public CreateProjectResponseBodyDataDatasetPolicy setDir(String dir) {
            this.dir = dir;
            return this;
        }
        public String getDir() {
            return this.dir;
        }

        public CreateProjectResponseBodyDataDatasetPolicy setExpire(String expire) {
            this.expire = expire;
            return this;
        }
        public String getExpire() {
            return this.expire;
        }

        public CreateProjectResponseBodyDataDatasetPolicy setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public CreateProjectResponseBodyDataDatasetPolicy setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public CreateProjectResponseBodyDataDatasetPolicy setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

    }

    public static class CreateProjectResponseBodyDataDataset extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Id")
        public String id;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("OssKey")
        public String ossKey;

        @NameInMap("Policy")
        public CreateProjectResponseBodyDataDatasetPolicy policy;

        public static CreateProjectResponseBodyDataDataset build(java.util.Map<String, ?> map) throws Exception {
            CreateProjectResponseBodyDataDataset self = new CreateProjectResponseBodyDataDataset();
            return TeaModel.build(map, self);
        }

        public CreateProjectResponseBodyDataDataset setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CreateProjectResponseBodyDataDataset setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateProjectResponseBodyDataDataset setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public CreateProjectResponseBodyDataDataset setOssKey(String ossKey) {
            this.ossKey = ossKey;
            return this;
        }
        public String getOssKey() {
            return this.ossKey;
        }

        public CreateProjectResponseBodyDataDataset setPolicy(CreateProjectResponseBodyDataDatasetPolicy policy) {
            this.policy = policy;
            return this;
        }
        public CreateProjectResponseBodyDataDatasetPolicy getPolicy() {
            return this.policy;
        }

    }

    public static class CreateProjectResponseBodyDataSourcePolicy extends TeaModel {
        @NameInMap("AccessId")
        public String accessId;

        @NameInMap("Dir")
        public String dir;

        @NameInMap("Expire")
        public String expire;

        @NameInMap("Host")
        public String host;

        @NameInMap("Policy")
        public String policy;

        @NameInMap("Signature")
        public String signature;

        public static CreateProjectResponseBodyDataSourcePolicy build(java.util.Map<String, ?> map) throws Exception {
            CreateProjectResponseBodyDataSourcePolicy self = new CreateProjectResponseBodyDataSourcePolicy();
            return TeaModel.build(map, self);
        }

        public CreateProjectResponseBodyDataSourcePolicy setAccessId(String accessId) {
            this.accessId = accessId;
            return this;
        }
        public String getAccessId() {
            return this.accessId;
        }

        public CreateProjectResponseBodyDataSourcePolicy setDir(String dir) {
            this.dir = dir;
            return this;
        }
        public String getDir() {
            return this.dir;
        }

        public CreateProjectResponseBodyDataSourcePolicy setExpire(String expire) {
            this.expire = expire;
            return this;
        }
        public String getExpire() {
            return this.expire;
        }

        public CreateProjectResponseBodyDataSourcePolicy setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public CreateProjectResponseBodyDataSourcePolicy setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public CreateProjectResponseBodyDataSourcePolicy setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

    }

    public static class CreateProjectResponseBodyDataSource extends TeaModel {
        @NameInMap("OssKey")
        public String ossKey;

        @NameInMap("Policy")
        public CreateProjectResponseBodyDataSourcePolicy policy;

        public static CreateProjectResponseBodyDataSource build(java.util.Map<String, ?> map) throws Exception {
            CreateProjectResponseBodyDataSource self = new CreateProjectResponseBodyDataSource();
            return TeaModel.build(map, self);
        }

        public CreateProjectResponseBodyDataSource setOssKey(String ossKey) {
            this.ossKey = ossKey;
            return this;
        }
        public String getOssKey() {
            return this.ossKey;
        }

        public CreateProjectResponseBodyDataSource setPolicy(CreateProjectResponseBodyDataSourcePolicy policy) {
            this.policy = policy;
            return this;
        }
        public CreateProjectResponseBodyDataSourcePolicy getPolicy() {
            return this.policy;
        }

    }

    public static class CreateProjectResponseBodyData extends TeaModel {
        @NameInMap("CreateMode")
        public String createMode;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Dataset")
        public CreateProjectResponseBodyDataDataset dataset;

        @NameInMap("Id")
        public String id;

        @NameInMap("Intro")
        public String intro;

        @NameInMap("Method")
        public String method;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("Source")
        public CreateProjectResponseBodyDataSource source;

        @NameInMap("Status")
        public String status;

        @NameInMap("Title")
        public String title;

        @NameInMap("Type")
        public String type;

        public static CreateProjectResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateProjectResponseBodyData self = new CreateProjectResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateProjectResponseBodyData setCreateMode(String createMode) {
            this.createMode = createMode;
            return this;
        }
        public String getCreateMode() {
            return this.createMode;
        }

        public CreateProjectResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CreateProjectResponseBodyData setDataset(CreateProjectResponseBodyDataDataset dataset) {
            this.dataset = dataset;
            return this;
        }
        public CreateProjectResponseBodyDataDataset getDataset() {
            return this.dataset;
        }

        public CreateProjectResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateProjectResponseBodyData setIntro(String intro) {
            this.intro = intro;
            return this;
        }
        public String getIntro() {
            return this.intro;
        }

        public CreateProjectResponseBodyData setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public CreateProjectResponseBodyData setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public CreateProjectResponseBodyData setSource(CreateProjectResponseBodyDataSource source) {
            this.source = source;
            return this;
        }
        public CreateProjectResponseBodyDataSource getSource() {
            return this.source;
        }

        public CreateProjectResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateProjectResponseBodyData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public CreateProjectResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
