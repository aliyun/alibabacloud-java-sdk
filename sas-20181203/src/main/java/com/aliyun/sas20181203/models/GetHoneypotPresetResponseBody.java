// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetHoneypotPresetResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetHoneypotPresetResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetHoneypotPresetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHoneypotPresetResponseBody self = new GetHoneypotPresetResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHoneypotPresetResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetHoneypotPresetResponseBody setData(GetHoneypotPresetResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetHoneypotPresetResponseBodyData getData() {
        return this.data;
    }

    public GetHoneypotPresetResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetHoneypotPresetResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetHoneypotPresetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetHoneypotPresetResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetHoneypotPresetResponseBodyDataFileInfoList extends TeaModel {
        @NameInMap("FileId")
        public String fileId;

        @NameInMap("FileName")
        public String fileName;

        @NameInMap("OssUrl")
        public String ossUrl;

        public static GetHoneypotPresetResponseBodyDataFileInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetHoneypotPresetResponseBodyDataFileInfoList self = new GetHoneypotPresetResponseBodyDataFileInfoList();
            return TeaModel.build(map, self);
        }

        public GetHoneypotPresetResponseBodyDataFileInfoList setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }
        public String getFileId() {
            return this.fileId;
        }

        public GetHoneypotPresetResponseBodyDataFileInfoList setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public GetHoneypotPresetResponseBodyDataFileInfoList setOssUrl(String ossUrl) {
            this.ossUrl = ossUrl;
            return this;
        }
        public String getOssUrl() {
            return this.ossUrl;
        }

    }

    public static class GetHoneypotPresetResponseBodyData extends TeaModel {
        @NameInMap("ControlNodeName")
        public String controlNodeName;

        @NameInMap("FileInfoList")
        public java.util.List<GetHoneypotPresetResponseBodyDataFileInfoList> fileInfoList;

        @NameInMap("HoneypotImageDisplayName")
        public String honeypotImageDisplayName;

        @NameInMap("HoneypotImageName")
        public String honeypotImageName;

        @NameInMap("HoneypotPresetId")
        public String honeypotPresetId;

        @NameInMap("Meta")
        public String meta;

        @NameInMap("NodeId")
        public String nodeId;

        @NameInMap("PresetName")
        public String presetName;

        @NameInMap("PresetType")
        public String presetType;

        public static GetHoneypotPresetResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetHoneypotPresetResponseBodyData self = new GetHoneypotPresetResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetHoneypotPresetResponseBodyData setControlNodeName(String controlNodeName) {
            this.controlNodeName = controlNodeName;
            return this;
        }
        public String getControlNodeName() {
            return this.controlNodeName;
        }

        public GetHoneypotPresetResponseBodyData setFileInfoList(java.util.List<GetHoneypotPresetResponseBodyDataFileInfoList> fileInfoList) {
            this.fileInfoList = fileInfoList;
            return this;
        }
        public java.util.List<GetHoneypotPresetResponseBodyDataFileInfoList> getFileInfoList() {
            return this.fileInfoList;
        }

        public GetHoneypotPresetResponseBodyData setHoneypotImageDisplayName(String honeypotImageDisplayName) {
            this.honeypotImageDisplayName = honeypotImageDisplayName;
            return this;
        }
        public String getHoneypotImageDisplayName() {
            return this.honeypotImageDisplayName;
        }

        public GetHoneypotPresetResponseBodyData setHoneypotImageName(String honeypotImageName) {
            this.honeypotImageName = honeypotImageName;
            return this;
        }
        public String getHoneypotImageName() {
            return this.honeypotImageName;
        }

        public GetHoneypotPresetResponseBodyData setHoneypotPresetId(String honeypotPresetId) {
            this.honeypotPresetId = honeypotPresetId;
            return this;
        }
        public String getHoneypotPresetId() {
            return this.honeypotPresetId;
        }

        public GetHoneypotPresetResponseBodyData setMeta(String meta) {
            this.meta = meta;
            return this;
        }
        public String getMeta() {
            return this.meta;
        }

        public GetHoneypotPresetResponseBodyData setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public GetHoneypotPresetResponseBodyData setPresetName(String presetName) {
            this.presetName = presetName;
            return this;
        }
        public String getPresetName() {
            return this.presetName;
        }

        public GetHoneypotPresetResponseBodyData setPresetType(String presetType) {
            this.presetType = presetType;
            return this;
        }
        public String getPresetType() {
            return this.presetType;
        }

    }

}
