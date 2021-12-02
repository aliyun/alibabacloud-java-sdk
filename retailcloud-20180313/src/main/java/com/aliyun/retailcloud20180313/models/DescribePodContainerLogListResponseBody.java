// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class DescribePodContainerLogListResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("ErrMsg")
    public String errMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribePodContainerLogListResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static DescribePodContainerLogListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePodContainerLogListResponseBody self = new DescribePodContainerLogListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePodContainerLogListResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribePodContainerLogListResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public DescribePodContainerLogListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePodContainerLogListResponseBody setResult(DescribePodContainerLogListResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribePodContainerLogListResponseBodyResult getResult() {
        return this.result;
    }

    public DescribePodContainerLogListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribePodContainerLogListResponseBodyResultContainerLogList extends TeaModel {
        @NameInMap("ContainerName")
        public String containerName;

        @NameInMap("Content")
        public String content;

        @NameInMap("PodName")
        public String podName;

        public static DescribePodContainerLogListResponseBodyResultContainerLogList build(java.util.Map<String, ?> map) throws Exception {
            DescribePodContainerLogListResponseBodyResultContainerLogList self = new DescribePodContainerLogListResponseBodyResultContainerLogList();
            return TeaModel.build(map, self);
        }

        public DescribePodContainerLogListResponseBodyResultContainerLogList setContainerName(String containerName) {
            this.containerName = containerName;
            return this;
        }
        public String getContainerName() {
            return this.containerName;
        }

        public DescribePodContainerLogListResponseBodyResultContainerLogList setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public DescribePodContainerLogListResponseBodyResultContainerLogList setPodName(String podName) {
            this.podName = podName;
            return this;
        }
        public String getPodName() {
            return this.podName;
        }

    }

    public static class DescribePodContainerLogListResponseBodyResult extends TeaModel {
        @NameInMap("ContainerLogList")
        public java.util.List<DescribePodContainerLogListResponseBodyResultContainerLogList> containerLogList;

        public static DescribePodContainerLogListResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribePodContainerLogListResponseBodyResult self = new DescribePodContainerLogListResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribePodContainerLogListResponseBodyResult setContainerLogList(java.util.List<DescribePodContainerLogListResponseBodyResultContainerLogList> containerLogList) {
            this.containerLogList = containerLogList;
            return this;
        }
        public java.util.List<DescribePodContainerLogListResponseBodyResultContainerLogList> getContainerLogList() {
            return this.containerLogList;
        }

    }

}
