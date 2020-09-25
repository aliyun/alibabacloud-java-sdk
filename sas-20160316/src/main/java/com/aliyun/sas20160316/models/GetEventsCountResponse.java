// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20160316.models;

import com.aliyun.tea.*;

public class GetEventsCountResponse extends TeaModel {
    @NameInMap("code")
    @Validation(required = true)
    public String code;

    @NameInMap("message")
    @Validation(required = true)
    public String message;

    @NameInMap("success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("EventCount")
    @Validation(required = true)
    public GetEventsCountResponseEventCount eventCount;

    public static GetEventsCountResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEventsCountResponse self = new GetEventsCountResponse();
        return TeaModel.build(map, self);
    }

    public GetEventsCountResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetEventsCountResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetEventsCountResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetEventsCountResponse setEventCount(GetEventsCountResponseEventCount eventCount) {
        this.eventCount = eventCount;
        return this;
    }
    public GetEventsCountResponseEventCount getEventCount() {
        return this.eventCount;
    }

    public static class GetEventsCountResponseEventCount extends TeaModel {
        @NameInMap("event")
        @Validation(required = true)
        public Long event;

        @NameInMap("attack")
        @Validation(required = true)
        public Long attack;

        @NameInMap("vul")
        @Validation(required = true)
        public Long vul;

        public static GetEventsCountResponseEventCount build(java.util.Map<String, ?> map) throws Exception {
            GetEventsCountResponseEventCount self = new GetEventsCountResponseEventCount();
            return TeaModel.build(map, self);
        }

        public GetEventsCountResponseEventCount setEvent(Long event) {
            this.event = event;
            return this;
        }
        public Long getEvent() {
            return this.event;
        }

        public GetEventsCountResponseEventCount setAttack(Long attack) {
            this.attack = attack;
            return this;
        }
        public Long getAttack() {
            return this.attack;
        }

        public GetEventsCountResponseEventCount setVul(Long vul) {
            this.vul = vul;
            return this;
        }
        public Long getVul() {
            return this.vul;
        }

    }

}
