// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sfmmultimodalapp20250909.models;

import com.aliyun.tea.*;

public class ListVoiceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("VoiceList")
    public java.util.List<ListVoiceResponseBodyVoiceList> voiceList;

    public static ListVoiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVoiceResponseBody self = new ListVoiceResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVoiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListVoiceResponseBody setVoiceList(java.util.List<ListVoiceResponseBodyVoiceList> voiceList) {
        this.voiceList = voiceList;
        return this;
    }
    public java.util.List<ListVoiceResponseBodyVoiceList> getVoiceList() {
        return this.voiceList;
    }

    public static class ListVoiceResponseBodyVoiceList extends TeaModel {
        @NameInMap("Gender")
        public String gender;

        @NameInMap("Illustration")
        public String illustration;

        @NameInMap("IllustrationAudio")
        public String illustrationAudio;

        @NameInMap("Language")
        public String language;

        @NameInMap("ModelId")
        public String modelId;

        @NameInMap("Name")
        public String name;

        @NameInMap("Voice")
        public String voice;

        public static ListVoiceResponseBodyVoiceList build(java.util.Map<String, ?> map) throws Exception {
            ListVoiceResponseBodyVoiceList self = new ListVoiceResponseBodyVoiceList();
            return TeaModel.build(map, self);
        }

        public ListVoiceResponseBodyVoiceList setGender(String gender) {
            this.gender = gender;
            return this;
        }
        public String getGender() {
            return this.gender;
        }

        public ListVoiceResponseBodyVoiceList setIllustration(String illustration) {
            this.illustration = illustration;
            return this;
        }
        public String getIllustration() {
            return this.illustration;
        }

        public ListVoiceResponseBodyVoiceList setIllustrationAudio(String illustrationAudio) {
            this.illustrationAudio = illustrationAudio;
            return this;
        }
        public String getIllustrationAudio() {
            return this.illustrationAudio;
        }

        public ListVoiceResponseBodyVoiceList setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public ListVoiceResponseBodyVoiceList setModelId(String modelId) {
            this.modelId = modelId;
            return this;
        }
        public String getModelId() {
            return this.modelId;
        }

        public ListVoiceResponseBodyVoiceList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListVoiceResponseBodyVoiceList setVoice(String voice) {
            this.voice = voice;
            return this;
        }
        public String getVoice() {
            return this.voice;
        }

    }

}
