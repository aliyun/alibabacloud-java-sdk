// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class CheckResourceRequest extends TeaModel {
    @NameInMap("Country")
    @Validation(required = true)
    public String country;

    @NameInMap("Interrupt")
    public Boolean interrupt;

    @NameInMap("Invoker")
    @Validation(required = true)
    public String invoker;

    @NameInMap("Pk")
    @Validation(required = true)
    public String pk;

    @NameInMap("Bid")
    @Validation(required = true)
    public String bid;

    @NameInMap("Hid")
    @Validation(required = true)
    public Long hid;

    @NameInMap("TaskIdentifier")
    @Validation(required = true)
    public String taskIdentifier;

    @NameInMap("TaskExtraData")
    @Validation(required = true)
    public String taskExtraData;

    @NameInMap("GmtWakeup")
    @Validation(required = true)
    public String gmtWakeup;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Message")
    public String message;

    @NameInMap("Level")
    public Long level;

    @NameInMap("Url")
    public String url;

    @NameInMap("Prompt")
    public String prompt;

    public static CheckResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckResourceRequest self = new CheckResourceRequest();
        return TeaModel.build(map, self);
    }

}
