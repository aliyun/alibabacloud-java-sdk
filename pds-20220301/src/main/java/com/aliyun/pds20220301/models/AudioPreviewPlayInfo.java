// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class AudioPreviewPlayInfo extends TeaModel {
    @NameInMap("meta")
    public AudioPreviewPlayInfoMeta meta;

    @NameInMap("offline_audio_list")
    public java.util.List<AudioPreviewPlayInfoOfflineAudioList> offlineAudioList;

    public static AudioPreviewPlayInfo build(java.util.Map<String, ?> map) throws Exception {
        AudioPreviewPlayInfo self = new AudioPreviewPlayInfo();
        return TeaModel.build(map, self);
    }

    public AudioPreviewPlayInfo setMeta(AudioPreviewPlayInfoMeta meta) {
        this.meta = meta;
        return this;
    }
    public AudioPreviewPlayInfoMeta getMeta() {
        return this.meta;
    }

    public AudioPreviewPlayInfo setOfflineAudioList(java.util.List<AudioPreviewPlayInfoOfflineAudioList> offlineAudioList) {
        this.offlineAudioList = offlineAudioList;
        return this;
    }
    public java.util.List<AudioPreviewPlayInfoOfflineAudioList> getOfflineAudioList() {
        return this.offlineAudioList;
    }

    public static class AudioPreviewPlayInfoMeta extends TeaModel {
        @NameInMap("duration")
        public Double duration;

        public static AudioPreviewPlayInfoMeta build(java.util.Map<String, ?> map) throws Exception {
            AudioPreviewPlayInfoMeta self = new AudioPreviewPlayInfoMeta();
            return TeaModel.build(map, self);
        }

        public AudioPreviewPlayInfoMeta setDuration(Double duration) {
            this.duration = duration;
            return this;
        }
        public Double getDuration() {
            return this.duration;
        }

    }

    public static class AudioPreviewPlayInfoOfflineAudioList extends TeaModel {
        @NameInMap("status")
        public String status;

        @NameInMap("template_id")
        public String templateId;

        @NameInMap("url")
        public String url;

        public static AudioPreviewPlayInfoOfflineAudioList build(java.util.Map<String, ?> map) throws Exception {
            AudioPreviewPlayInfoOfflineAudioList self = new AudioPreviewPlayInfoOfflineAudioList();
            return TeaModel.build(map, self);
        }

        public AudioPreviewPlayInfoOfflineAudioList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public AudioPreviewPlayInfoOfflineAudioList setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public AudioPreviewPlayInfoOfflineAudioList setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
