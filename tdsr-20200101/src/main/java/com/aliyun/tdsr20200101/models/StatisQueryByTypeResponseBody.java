// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class StatisQueryByTypeResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 返回码
    @NameInMap("Code")
    public Long code;

    // 是否请求成功
    @NameInMap("Success")
    public Boolean success;

    // 错误消息
    @NameInMap("Message")
    public String message;

    // 返回集合
    @NameInMap("List")
    public java.util.List<StatisQueryByTypeResponseBodyList> list;

    public static StatisQueryByTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StatisQueryByTypeResponseBody self = new StatisQueryByTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public StatisQueryByTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StatisQueryByTypeResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public StatisQueryByTypeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public StatisQueryByTypeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public StatisQueryByTypeResponseBody setList(java.util.List<StatisQueryByTypeResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<StatisQueryByTypeResponseBodyList> getList() {
        return this.list;
    }

    public static class StatisQueryByTypeResponseBodyList extends TeaModel {
        // 0：默认类型(增加type字段时默认值) 1：3D模型 2：全景图片3：全景视频
        @NameInMap("Type")
        public Integer type;

        // 当前日期主场景数量
        @NameInMap("Count")
        public Integer count;

        public static StatisQueryByTypeResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            StatisQueryByTypeResponseBodyList self = new StatisQueryByTypeResponseBodyList();
            return TeaModel.build(map, self);
        }

        public StatisQueryByTypeResponseBodyList setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public StatisQueryByTypeResponseBodyList setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

    }

}
