// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeLinktIterationmeetingRequest extends TeaModel {
    @NameInMap("Content")
    public String content;

    @NameInMap("Id")
    public Long id;

    @NameInMap("IterationSign")
    public String iterationSign;

    @NameInMap("Title")
    public String title;

    @NameInMap("AttachmentIdsRepeatList")
    public java.util.List<Integer> attachmentIdsRepeatList;

    public static CreateLinkeLinktIterationmeetingRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeLinktIterationmeetingRequest self = new CreateLinkeLinktIterationmeetingRequest();
        return TeaModel.build(map, self);
    }

    public CreateLinkeLinktIterationmeetingRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public CreateLinkeLinktIterationmeetingRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public CreateLinkeLinktIterationmeetingRequest setIterationSign(String iterationSign) {
        this.iterationSign = iterationSign;
        return this;
    }
    public String getIterationSign() {
        return this.iterationSign;
    }

    public CreateLinkeLinktIterationmeetingRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public CreateLinkeLinktIterationmeetingRequest setAttachmentIdsRepeatList(java.util.List<Integer> attachmentIdsRepeatList) {
        this.attachmentIdsRepeatList = attachmentIdsRepeatList;
        return this;
    }
    public java.util.List<Integer> getAttachmentIdsRepeatList() {
        return this.attachmentIdsRepeatList;
    }

}
