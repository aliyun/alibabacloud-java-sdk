// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListHasInspectUserapppodResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public ListHasInspectUserapppodResponseBodyResultContent resultContent;

    public static ListHasInspectUserapppodResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListHasInspectUserapppodResponseBody self = new ListHasInspectUserapppodResponseBody();
        return TeaModel.build(map, self);
    }

    public ListHasInspectUserapppodResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListHasInspectUserapppodResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListHasInspectUserapppodResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListHasInspectUserapppodResponseBody setResultContent(ListHasInspectUserapppodResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public ListHasInspectUserapppodResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class ListHasInspectUserapppodResponseBodyResultContentData extends TeaModel {
        @NameInMap("AppInstanceId")
        public String appInstanceId;

        @NameInMap("IaasMetadataName")
        public String iaasMetadataName;

        @NameInMap("IaasMetadataId")
        public String iaasMetadataId;

        @NameInMap("Name")
        public String name;

        @NameInMap("Cpu")
        public Long cpu;

        @NameInMap("Image")
        public String image;

        @NameInMap("HostName")
        public String hostName;

        @NameInMap("Memory")
        public Long memory;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("HostIp")
        public String hostIp;

        @NameInMap("Status")
        public String status;

        @NameInMap("Source")
        public String source;

        @NameInMap("PodName")
        public String podName;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("Id")
        public String id;

        @NameInMap("UtcCreate")
        public String utcCreate;

        @NameInMap("UtcModified")
        public String utcModified;

        public static ListHasInspectUserapppodResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            ListHasInspectUserapppodResponseBodyResultContentData self = new ListHasInspectUserapppodResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public ListHasInspectUserapppodResponseBodyResultContentData setAppInstanceId(String appInstanceId) {
            this.appInstanceId = appInstanceId;
            return this;
        }
        public String getAppInstanceId() {
            return this.appInstanceId;
        }

        public ListHasInspectUserapppodResponseBodyResultContentData setIaasMetadataName(String iaasMetadataName) {
            this.iaasMetadataName = iaasMetadataName;
            return this;
        }
        public String getIaasMetadataName() {
            return this.iaasMetadataName;
        }

        public ListHasInspectUserapppodResponseBodyResultContentData setIaasMetadataId(String iaasMetadataId) {
            this.iaasMetadataId = iaasMetadataId;
            return this;
        }
        public String getIaasMetadataId() {
            return this.iaasMetadataId;
        }

        public ListHasInspectUserapppodResponseBodyResultContentData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListHasInspectUserapppodResponseBodyResultContentData setCpu(Long cpu) {
            this.cpu = cpu;
            return this;
        }
        public Long getCpu() {
            return this.cpu;
        }

        public ListHasInspectUserapppodResponseBodyResultContentData setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public ListHasInspectUserapppodResponseBodyResultContentData setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public ListHasInspectUserapppodResponseBodyResultContentData setMemory(Long memory) {
            this.memory = memory;
            return this;
        }
        public Long getMemory() {
            return this.memory;
        }

        public ListHasInspectUserapppodResponseBodyResultContentData setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public ListHasInspectUserapppodResponseBodyResultContentData setHostIp(String hostIp) {
            this.hostIp = hostIp;
            return this;
        }
        public String getHostIp() {
            return this.hostIp;
        }

        public ListHasInspectUserapppodResponseBodyResultContentData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListHasInspectUserapppodResponseBodyResultContentData setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ListHasInspectUserapppodResponseBodyResultContentData setPodName(String podName) {
            this.podName = podName;
            return this;
        }
        public String getPodName() {
            return this.podName;
        }

        public ListHasInspectUserapppodResponseBodyResultContentData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public ListHasInspectUserapppodResponseBodyResultContentData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListHasInspectUserapppodResponseBodyResultContentData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public ListHasInspectUserapppodResponseBodyResultContentData setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

    }

    public static class ListHasInspectUserapppodResponseBodyResultContentTopErrorCode extends TeaModel {
        @NameInMap("ExceptionCode")
        public String exceptionCode;

        @NameInMap("ExceptionCodeDescription")
        public String exceptionCodeDescription;

        @NameInMap("Level")
        public String level;

        @NameInMap("Prefix")
        public String prefix;

        @NameInMap("Scene")
        public String scene;

        @NameInMap("SceneName")
        public String sceneName;

        @NameInMap("Type")
        public String type;

        @NameInMap("Version")
        public String version;

        public static ListHasInspectUserapppodResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            ListHasInspectUserapppodResponseBodyResultContentTopErrorCode self = new ListHasInspectUserapppodResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public ListHasInspectUserapppodResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public ListHasInspectUserapppodResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public ListHasInspectUserapppodResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public ListHasInspectUserapppodResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public ListHasInspectUserapppodResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public ListHasInspectUserapppodResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public ListHasInspectUserapppodResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListHasInspectUserapppodResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class ListHasInspectUserapppodResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static ListHasInspectUserapppodResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            ListHasInspectUserapppodResponseBodyResultContentTopErrorReason self = new ListHasInspectUserapppodResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public ListHasInspectUserapppodResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListHasInspectUserapppodResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class ListHasInspectUserapppodResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("Data")
        public java.util.List<ListHasInspectUserapppodResponseBodyResultContentData> data;

        @NameInMap("TopErrorCode")
        public ListHasInspectUserapppodResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("TopErrorReason")
        public ListHasInspectUserapppodResponseBodyResultContentTopErrorReason topErrorReason;

        public static ListHasInspectUserapppodResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            ListHasInspectUserapppodResponseBodyResultContent self = new ListHasInspectUserapppodResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public ListHasInspectUserapppodResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListHasInspectUserapppodResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListHasInspectUserapppodResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public ListHasInspectUserapppodResponseBodyResultContent setData(java.util.List<ListHasInspectUserapppodResponseBodyResultContentData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<ListHasInspectUserapppodResponseBodyResultContentData> getData() {
            return this.data;
        }

        public ListHasInspectUserapppodResponseBodyResultContent setTopErrorCode(ListHasInspectUserapppodResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public ListHasInspectUserapppodResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public ListHasInspectUserapppodResponseBodyResultContent setTopErrorReason(ListHasInspectUserapppodResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public ListHasInspectUserapppodResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
