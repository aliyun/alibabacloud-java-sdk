// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DeleteCloudNotePhrasesRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ac7N****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Phrase")
    public DeleteCloudNotePhrasesRequestPhrase phrase;

    public static DeleteCloudNotePhrasesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCloudNotePhrasesRequest self = new DeleteCloudNotePhrasesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCloudNotePhrasesRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DeleteCloudNotePhrasesRequest setPhrase(DeleteCloudNotePhrasesRequestPhrase phrase) {
        this.phrase = phrase;
        return this;
    }
    public DeleteCloudNotePhrasesRequestPhrase getPhrase() {
        return this.phrase;
    }

    public static class DeleteCloudNotePhrasesRequestPhrase extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1qasw23ezcsrfsawq</p>
         */
        @NameInMap("Id")
        public String id;

        public static DeleteCloudNotePhrasesRequestPhrase build(java.util.Map<String, ?> map) throws Exception {
            DeleteCloudNotePhrasesRequestPhrase self = new DeleteCloudNotePhrasesRequestPhrase();
            return TeaModel.build(map, self);
        }

        public DeleteCloudNotePhrasesRequestPhrase setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
