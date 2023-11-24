// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class PushUserAnalyzerEntriesRequest extends TeaModel {
    /**
     * <p>The entries of the custom analyzer.</p>
     */
    @NameInMap("entries")
    public java.util.List<PushUserAnalyzerEntriesRequestEntries> entries;

    /**
     * <p>Specifies whether to perform a dry run. This parameter is only used to check whether the data source is valid. Valid values: true and false.</p>
     */
    @NameInMap("dryRun")
    public Boolean dryRun;

    public static PushUserAnalyzerEntriesRequest build(java.util.Map<String, ?> map) throws Exception {
        PushUserAnalyzerEntriesRequest self = new PushUserAnalyzerEntriesRequest();
        return TeaModel.build(map, self);
    }

    public PushUserAnalyzerEntriesRequest setEntries(java.util.List<PushUserAnalyzerEntriesRequestEntries> entries) {
        this.entries = entries;
        return this;
    }
    public java.util.List<PushUserAnalyzerEntriesRequestEntries> getEntries() {
        return this.entries;
    }

    public PushUserAnalyzerEntriesRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public static class PushUserAnalyzerEntriesRequestEntries extends TeaModel {
        /**
         * <p>The operation to be performed on the entries.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   add</p>
         * <p>*   delete</p>
         */
        @NameInMap("cmd")
        public String cmd;

        /**
         * <p>The key to be used to query entries.</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>Specifies whether to further analyze the terms that are generated after the search query is analyzed.</p>
         * <br>
         * <p>Default value: true.</p>
         */
        @NameInMap("splitEnabled")
        public Boolean splitEnabled;

        /**
         * <p>The analysis result.</p>
         */
        @NameInMap("value")
        public String value;

        public static PushUserAnalyzerEntriesRequestEntries build(java.util.Map<String, ?> map) throws Exception {
            PushUserAnalyzerEntriesRequestEntries self = new PushUserAnalyzerEntriesRequestEntries();
            return TeaModel.build(map, self);
        }

        public PushUserAnalyzerEntriesRequestEntries setCmd(String cmd) {
            this.cmd = cmd;
            return this;
        }
        public String getCmd() {
            return this.cmd;
        }

        public PushUserAnalyzerEntriesRequestEntries setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public PushUserAnalyzerEntriesRequestEntries setSplitEnabled(Boolean splitEnabled) {
            this.splitEnabled = splitEnabled;
            return this;
        }
        public Boolean getSplitEnabled() {
            return this.splitEnabled;
        }

        public PushUserAnalyzerEntriesRequestEntries setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
