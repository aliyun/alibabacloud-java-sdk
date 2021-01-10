// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeLinklogKnowledgefeedbacklistRequest extends TeaModel {
    @NameInMap("Begin")
    public Long begin;

    @NameInMap("BeginText")
    public String beginText;

    @NameInMap("DataRepeatList")
    public java.util.List<String> dataRepeatList;

    @NameInMap("End")
    public Long end;

    @NameInMap("EndText")
    public String endText;

    @NameInMap("Feedback")
    public String feedback;

    @NameInMap("FieldsRepeatList")
    public java.util.List<String> fieldsRepeatList;

    @NameInMap("ListRepeatList")
    public java.util.List<String> listRepeatList;

    @NameInMap("StoreIds")
    public Long storeIds;

    public static GetLinkeLinklogKnowledgefeedbacklistRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeLinklogKnowledgefeedbacklistRequest self = new GetLinkeLinklogKnowledgefeedbacklistRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeLinklogKnowledgefeedbacklistRequest setBegin(Long begin) {
        this.begin = begin;
        return this;
    }
    public Long getBegin() {
        return this.begin;
    }

    public GetLinkeLinklogKnowledgefeedbacklistRequest setBeginText(String beginText) {
        this.beginText = beginText;
        return this;
    }
    public String getBeginText() {
        return this.beginText;
    }

    public GetLinkeLinklogKnowledgefeedbacklistRequest setDataRepeatList(java.util.List<String> dataRepeatList) {
        this.dataRepeatList = dataRepeatList;
        return this;
    }
    public java.util.List<String> getDataRepeatList() {
        return this.dataRepeatList;
    }

    public GetLinkeLinklogKnowledgefeedbacklistRequest setEnd(Long end) {
        this.end = end;
        return this;
    }
    public Long getEnd() {
        return this.end;
    }

    public GetLinkeLinklogKnowledgefeedbacklistRequest setEndText(String endText) {
        this.endText = endText;
        return this;
    }
    public String getEndText() {
        return this.endText;
    }

    public GetLinkeLinklogKnowledgefeedbacklistRequest setFeedback(String feedback) {
        this.feedback = feedback;
        return this;
    }
    public String getFeedback() {
        return this.feedback;
    }

    public GetLinkeLinklogKnowledgefeedbacklistRequest setFieldsRepeatList(java.util.List<String> fieldsRepeatList) {
        this.fieldsRepeatList = fieldsRepeatList;
        return this;
    }
    public java.util.List<String> getFieldsRepeatList() {
        return this.fieldsRepeatList;
    }

    public GetLinkeLinklogKnowledgefeedbacklistRequest setListRepeatList(java.util.List<String> listRepeatList) {
        this.listRepeatList = listRepeatList;
        return this;
    }
    public java.util.List<String> getListRepeatList() {
        return this.listRepeatList;
    }

    public GetLinkeLinklogKnowledgefeedbacklistRequest setStoreIds(Long storeIds) {
        this.storeIds = storeIds;
        return this;
    }
    public Long getStoreIds() {
        return this.storeIds;
    }

}
