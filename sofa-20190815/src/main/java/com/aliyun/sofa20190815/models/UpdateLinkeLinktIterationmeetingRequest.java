// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeLinktIterationmeetingRequest extends TeaModel {
    @NameInMap("AttachmentIdsRepeatList")
    public java.util.List<Long> attachmentIdsRepeatList;

    @NameInMap("Content")
    public String content;

    @NameInMap("Id")
    public Long id;

    @NameInMap("IterationSign")
    public String iterationSign;

    @NameInMap("Title")
    public String title;

    public static UpdateLinkeLinktIterationmeetingRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeLinktIterationmeetingRequest self = new UpdateLinkeLinktIterationmeetingRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeLinktIterationmeetingRequest setAttachmentIdsRepeatList(java.util.List<Long> attachmentIdsRepeatList) {
        this.attachmentIdsRepeatList = attachmentIdsRepeatList;
        return this;
    }
    public java.util.List<Long> getAttachmentIdsRepeatList() {
        return this.attachmentIdsRepeatList;
    }

    public UpdateLinkeLinktIterationmeetingRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public UpdateLinkeLinktIterationmeetingRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateLinkeLinktIterationmeetingRequest setIterationSign(String iterationSign) {
        this.iterationSign = iterationSign;
        return this;
    }
    public String getIterationSign() {
        return this.iterationSign;
    }

    public UpdateLinkeLinktIterationmeetingRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
