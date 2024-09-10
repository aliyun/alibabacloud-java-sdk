// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetHoneypotPresetResponseBody extends TeaModel {
    /**
     * <p>The status code returned. The status code <strong>200</strong> indicates that the request was successful. Other status codes indicate that the request failed. You can identify the cause of the failure based on the status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The information about the honeypot template.</p>
     */
    @NameInMap("Data")
    public GetHoneypotPresetResponseBodyData data;

    /**
     * <p>The HTTP status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>38AFE393-88E8-5642-B3E2-D57C6E76025D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The request was successful.</li>
     * <li><strong>false</strong>: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>The ID of the uploaded file.</p>
         * 
         * <strong>example:</strong>
         * <p>HONEYPOT_FILE/1765_167040128****</p>
         */
        @NameInMap("FileId")
        public String fileId;

        /**
         * <p>The name of the uploaded file.</p>
         * 
         * <strong>example:</strong>
         * <p>HONEYPOT_FILE****</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <p>The download URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://aegis">http://aegis</a>****</p>
         */
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
        /**
         * <p>The name of the management node.</p>
         * 
         * <strong>example:</strong>
         * <p>managerNodename</p>
         */
        @NameInMap("ControlNodeName")
        public String controlNodeName;

        /**
         * <p>An array that consists of the configurations of the uploaded file.</p>
         */
        @NameInMap("FileInfoList")
        public java.util.List<GetHoneypotPresetResponseBodyDataFileInfoList> fileInfoList;

        /**
         * <p>The display name of the honeypot image.</p>
         * 
         * <strong>example:</strong>
         * <p>RuoYi</p>
         */
        @NameInMap("HoneypotImageDisplayName")
        public String honeypotImageDisplayName;

        /**
         * <p>The name of the honeypot image.</p>
         * 
         * <strong>example:</strong>
         * <p>ruoyi</p>
         */
        @NameInMap("HoneypotImageName")
        public String honeypotImageName;

        /**
         * <p>The ID of the honeypot template.</p>
         * 
         * <strong>example:</strong>
         * <p>94fd8805-d178-4361-84d3-de47fb4e****</p>
         */
        @NameInMap("HoneypotPresetId")
        public String honeypotPresetId;

        /**
         * <p>The custom configuration of the honeypot template.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;trojan_git&quot;:&quot;zip&quot;,&quot;burp&quot;:&quot;open&quot;,&quot;portrait_option&quot;:&quot;true&quot;}</p>
         */
        @NameInMap("Meta")
        public String meta;

        /**
         * <p>The ID of the management node.</p>
         * 
         * <strong>example:</strong>
         * <p>a882e590-b87b-45a6-87b9-d0a3e5a0****</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>The custom name of the honeypot template.</p>
         * 
         * <strong>example:</strong>
         * <p>ssh</p>
         */
        @NameInMap("PresetName")
        public String presetName;

        /**
         * <p>The type of the honeypot template. Valid values:</p>
         * <ul>
         * <li><strong>TEMP</strong>: automatically generated template</li>
         * <li><strong>CUSTOM</strong>: custom template</li>
         * <li><strong>DEFAULT</strong>: default template</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CUSTOM</p>
         */
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
