// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class UpdateOssExternalStoreRequest extends TeaModel {
    @NameInMap("externalStoreName")
    public String externalStoreName;

    @NameInMap("parameter")
    public UpdateOssExternalStoreRequestParameter parameter;

    @NameInMap("storeType")
    public String storeType;

    public static UpdateOssExternalStoreRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateOssExternalStoreRequest self = new UpdateOssExternalStoreRequest();
        return TeaModel.build(map, self);
    }

    public UpdateOssExternalStoreRequest setExternalStoreName(String externalStoreName) {
        this.externalStoreName = externalStoreName;
        return this;
    }
    public String getExternalStoreName() {
        return this.externalStoreName;
    }

    public UpdateOssExternalStoreRequest setParameter(UpdateOssExternalStoreRequestParameter parameter) {
        this.parameter = parameter;
        return this;
    }
    public UpdateOssExternalStoreRequestParameter getParameter() {
        return this.parameter;
    }

    public UpdateOssExternalStoreRequest setStoreType(String storeType) {
        this.storeType = storeType;
        return this;
    }
    public String getStoreType() {
        return this.storeType;
    }

    public static class UpdateOssExternalStoreRequestParameterColumns extends TeaModel {
        @NameInMap("name")
        public String name;

        @NameInMap("type")
        public String type;

        public static UpdateOssExternalStoreRequestParameterColumns build(java.util.Map<String, ?> map) throws Exception {
            UpdateOssExternalStoreRequestParameterColumns self = new UpdateOssExternalStoreRequestParameterColumns();
            return TeaModel.build(map, self);
        }

        public UpdateOssExternalStoreRequestParameterColumns setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateOssExternalStoreRequestParameterColumns setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateOssExternalStoreRequestParameter extends TeaModel {
        @NameInMap("accessid")
        public String accessid;

        @NameInMap("accesskey")
        public String accesskey;

        @NameInMap("bucket")
        public String bucket;

        @NameInMap("columns")
        public java.util.List<UpdateOssExternalStoreRequestParameterColumns> columns;

        @NameInMap("endpoint")
        public String endpoint;

        @NameInMap("objects")
        public java.util.List<String> objects;

        public static UpdateOssExternalStoreRequestParameter build(java.util.Map<String, ?> map) throws Exception {
            UpdateOssExternalStoreRequestParameter self = new UpdateOssExternalStoreRequestParameter();
            return TeaModel.build(map, self);
        }

        public UpdateOssExternalStoreRequestParameter setAccessid(String accessid) {
            this.accessid = accessid;
            return this;
        }
        public String getAccessid() {
            return this.accessid;
        }

        public UpdateOssExternalStoreRequestParameter setAccesskey(String accesskey) {
            this.accesskey = accesskey;
            return this;
        }
        public String getAccesskey() {
            return this.accesskey;
        }

        public UpdateOssExternalStoreRequestParameter setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public UpdateOssExternalStoreRequestParameter setColumns(java.util.List<UpdateOssExternalStoreRequestParameterColumns> columns) {
            this.columns = columns;
            return this;
        }
        public java.util.List<UpdateOssExternalStoreRequestParameterColumns> getColumns() {
            return this.columns;
        }

        public UpdateOssExternalStoreRequestParameter setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public UpdateOssExternalStoreRequestParameter setObjects(java.util.List<String> objects) {
            this.objects = objects;
            return this;
        }
        public java.util.List<String> getObjects() {
            return this.objects;
        }

    }

}
