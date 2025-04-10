// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rai20240701.models;

import com.aliyun.tea.*;

public class SyncSensitiveWordRequest extends TeaModel {
    @NameInMap("BodyData")
    public SyncSensitiveWordRequestBodyData bodyData;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Commit")
    public Boolean commit;

    /**
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static SyncSensitiveWordRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncSensitiveWordRequest self = new SyncSensitiveWordRequest();
        return TeaModel.build(map, self);
    }

    public SyncSensitiveWordRequest setBodyData(SyncSensitiveWordRequestBodyData bodyData) {
        this.bodyData = bodyData;
        return this;
    }
    public SyncSensitiveWordRequestBodyData getBodyData() {
        return this.bodyData;
    }

    public SyncSensitiveWordRequest setCommit(Boolean commit) {
        this.commit = commit;
        return this;
    }
    public Boolean getCommit() {
        return this.commit;
    }

    public SyncSensitiveWordRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class SyncSensitiveWordRequestBodyDataSensitiveWordList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>341806</p>
         */
        @NameInMap("Id")
        public Integer id;

        @NameInMap("Label")
        public String label;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("Word")
        public String word;

        public static SyncSensitiveWordRequestBodyDataSensitiveWordList build(java.util.Map<String, ?> map) throws Exception {
            SyncSensitiveWordRequestBodyDataSensitiveWordList self = new SyncSensitiveWordRequestBodyDataSensitiveWordList();
            return TeaModel.build(map, self);
        }

        public SyncSensitiveWordRequestBodyDataSensitiveWordList setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public SyncSensitiveWordRequestBodyDataSensitiveWordList setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public SyncSensitiveWordRequestBodyDataSensitiveWordList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public SyncSensitiveWordRequestBodyDataSensitiveWordList setWord(String word) {
            this.word = word;
            return this;
        }
        public String getWord() {
            return this.word;
        }

    }

    public static class SyncSensitiveWordRequestBodyData extends TeaModel {
        @NameInMap("SensitiveWordList")
        public java.util.List<SyncSensitiveWordRequestBodyDataSensitiveWordList> sensitiveWordList;

        public static SyncSensitiveWordRequestBodyData build(java.util.Map<String, ?> map) throws Exception {
            SyncSensitiveWordRequestBodyData self = new SyncSensitiveWordRequestBodyData();
            return TeaModel.build(map, self);
        }

        public SyncSensitiveWordRequestBodyData setSensitiveWordList(java.util.List<SyncSensitiveWordRequestBodyDataSensitiveWordList> sensitiveWordList) {
            this.sensitiveWordList = sensitiveWordList;
            return this;
        }
        public java.util.List<SyncSensitiveWordRequestBodyDataSensitiveWordList> getSensitiveWordList() {
            return this.sensitiveWordList;
        }

    }

}
