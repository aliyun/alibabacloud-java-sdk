// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class BatchCreateMaliciousNoteRequest extends TeaModel {
    /**
     * <p>The batches.</p>
     */
    @NameInMap("ImageMaliciousFileList")
    public java.util.List<BatchCreateMaliciousNoteRequestImageMaliciousFileList> imageMaliciousFileList;

    public static BatchCreateMaliciousNoteRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchCreateMaliciousNoteRequest self = new BatchCreateMaliciousNoteRequest();
        return TeaModel.build(map, self);
    }

    public BatchCreateMaliciousNoteRequest setImageMaliciousFileList(java.util.List<BatchCreateMaliciousNoteRequestImageMaliciousFileList> imageMaliciousFileList) {
        this.imageMaliciousFileList = imageMaliciousFileList;
        return this;
    }
    public java.util.List<BatchCreateMaliciousNoteRequestImageMaliciousFileList> getImageMaliciousFileList() {
        return this.imageMaliciousFileList;
    }

    public static class BatchCreateMaliciousNoteRequestImageMaliciousFileList extends TeaModel {
        /**
         * <p>The ID of the alert.</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribeSuspEvents~~">DescribeSuspEvents</a> operation to query the alert IDs.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("EventId")
        public Long eventId;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>Malware sample</p>
         */
        @NameInMap("Note")
        public String note;

        public static BatchCreateMaliciousNoteRequestImageMaliciousFileList build(java.util.Map<String, ?> map) throws Exception {
            BatchCreateMaliciousNoteRequestImageMaliciousFileList self = new BatchCreateMaliciousNoteRequestImageMaliciousFileList();
            return TeaModel.build(map, self);
        }

        public BatchCreateMaliciousNoteRequestImageMaliciousFileList setEventId(Long eventId) {
            this.eventId = eventId;
            return this;
        }
        public Long getEventId() {
            return this.eventId;
        }

        public BatchCreateMaliciousNoteRequestImageMaliciousFileList setNote(String note) {
            this.note = note;
            return this;
        }
        public String getNote() {
            return this.note;
        }

    }

}
