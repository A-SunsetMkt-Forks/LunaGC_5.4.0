// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AvatarExpeditionCallBackRsp.proto

package emu.grasscutter.net.proto;

public final class AvatarExpeditionCallBackRspOuterClass {
  private AvatarExpeditionCallBackRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AvatarExpeditionCallBackRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AvatarExpeditionCallBackRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 5;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>map&lt;uint64, .AvatarExpeditionInfo&gt; expedition_info_map = 6;</code>
     */
    int getExpeditionInfoMapCount();
    /**
     * <code>map&lt;uint64, .AvatarExpeditionInfo&gt; expedition_info_map = 6;</code>
     */
    boolean containsExpeditionInfoMap(
        long key);
    /**
     * Use {@link #getExpeditionInfoMapMap()} instead.
     */
    @java.lang.Deprecated
    java.util.Map<java.lang.Long, emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo>
    getExpeditionInfoMap();
    /**
     * <code>map&lt;uint64, .AvatarExpeditionInfo&gt; expedition_info_map = 6;</code>
     */
    java.util.Map<java.lang.Long, emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo>
    getExpeditionInfoMapMap();
    /**
     * <code>map&lt;uint64, .AvatarExpeditionInfo&gt; expedition_info_map = 6;</code>
     */

    emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo getExpeditionInfoMapOrDefault(
        long key,
        emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo defaultValue);
    /**
     * <code>map&lt;uint64, .AvatarExpeditionInfo&gt; expedition_info_map = 6;</code>
     */

    emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo getExpeditionInfoMapOrThrow(
        long key);
  }
  /**
   * Protobuf type {@code AvatarExpeditionCallBackRsp}
   */
  public static final class AvatarExpeditionCallBackRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AvatarExpeditionCallBackRsp)
      AvatarExpeditionCallBackRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AvatarExpeditionCallBackRsp.newBuilder() to construct.
    private AvatarExpeditionCallBackRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AvatarExpeditionCallBackRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AvatarExpeditionCallBackRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private AvatarExpeditionCallBackRsp(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 40: {

              retcode_ = input.readInt32();
              break;
            }
            case 50: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                expeditionInfoMap_ = com.google.protobuf.MapField.newMapField(
                    ExpeditionInfoMapDefaultEntryHolder.defaultEntry);
                mutable_bitField0_ |= 0x00000001;
              }
              com.google.protobuf.MapEntry<java.lang.Long, emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo>
              expeditionInfoMap__ = input.readMessage(
                  ExpeditionInfoMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              expeditionInfoMap_.getMutableMap().put(
                  expeditionInfoMap__.getKey(), expeditionInfoMap__.getValue());
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.AvatarExpeditionCallBackRspOuterClass.internal_static_AvatarExpeditionCallBackRsp_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @java.lang.Override
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 6:
          return internalGetExpeditionInfoMap();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.AvatarExpeditionCallBackRspOuterClass.internal_static_AvatarExpeditionCallBackRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.AvatarExpeditionCallBackRspOuterClass.AvatarExpeditionCallBackRsp.class, emu.grasscutter.net.proto.AvatarExpeditionCallBackRspOuterClass.AvatarExpeditionCallBackRsp.Builder.class);
    }

    public static final int RETCODE_FIELD_NUMBER = 5;
    private int retcode_;
    /**
     * <code>int32 retcode = 5;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int EXPEDITION_INFO_MAP_FIELD_NUMBER = 6;
    private static final class ExpeditionInfoMapDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<
          java.lang.Long, emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo> defaultEntry =
              com.google.protobuf.MapEntry
              .<java.lang.Long, emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo>newDefaultInstance(
                  emu.grasscutter.net.proto.AvatarExpeditionCallBackRspOuterClass.internal_static_AvatarExpeditionCallBackRsp_ExpeditionInfoMapEntry_descriptor, 
                  com.google.protobuf.WireFormat.FieldType.UINT64,
                  0L,
                  com.google.protobuf.WireFormat.FieldType.MESSAGE,
                  emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo.getDefaultInstance());
    }
    private com.google.protobuf.MapField<
        java.lang.Long, emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo> expeditionInfoMap_;
    private com.google.protobuf.MapField<java.lang.Long, emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo>
    internalGetExpeditionInfoMap() {
      if (expeditionInfoMap_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            ExpeditionInfoMapDefaultEntryHolder.defaultEntry);
      }
      return expeditionInfoMap_;
    }

    public int getExpeditionInfoMapCount() {
      return internalGetExpeditionInfoMap().getMap().size();
    }
    /**
     * <code>map&lt;uint64, .AvatarExpeditionInfo&gt; expedition_info_map = 6;</code>
     */

    @java.lang.Override
    public boolean containsExpeditionInfoMap(
        long key) {
      
      return internalGetExpeditionInfoMap().getMap().containsKey(key);
    }
    /**
     * Use {@link #getExpeditionInfoMapMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.Long, emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo> getExpeditionInfoMap() {
      return getExpeditionInfoMapMap();
    }
    /**
     * <code>map&lt;uint64, .AvatarExpeditionInfo&gt; expedition_info_map = 6;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.Long, emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo> getExpeditionInfoMapMap() {
      return internalGetExpeditionInfoMap().getMap();
    }
    /**
     * <code>map&lt;uint64, .AvatarExpeditionInfo&gt; expedition_info_map = 6;</code>
     */
    @java.lang.Override

    public emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo getExpeditionInfoMapOrDefault(
        long key,
        emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo defaultValue) {
      
      java.util.Map<java.lang.Long, emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo> map =
          internalGetExpeditionInfoMap().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;uint64, .AvatarExpeditionInfo&gt; expedition_info_map = 6;</code>
     */
    @java.lang.Override

    public emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo getExpeditionInfoMapOrThrow(
        long key) {
      
      java.util.Map<java.lang.Long, emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo> map =
          internalGetExpeditionInfoMap().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (retcode_ != 0) {
        output.writeInt32(5, retcode_);
      }
      com.google.protobuf.GeneratedMessageV3
        .serializeLongMapTo(
          output,
          internalGetExpeditionInfoMap(),
          ExpeditionInfoMapDefaultEntryHolder.defaultEntry,
          6);
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(5, retcode_);
      }
      for (java.util.Map.Entry<java.lang.Long, emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo> entry
           : internalGetExpeditionInfoMap().getMap().entrySet()) {
        com.google.protobuf.MapEntry<java.lang.Long, emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo>
        expeditionInfoMap__ = ExpeditionInfoMapDefaultEntryHolder.defaultEntry.newBuilderForType()
            .setKey(entry.getKey())
            .setValue(entry.getValue())
            .build();
        size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(6, expeditionInfoMap__);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.AvatarExpeditionCallBackRspOuterClass.AvatarExpeditionCallBackRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.AvatarExpeditionCallBackRspOuterClass.AvatarExpeditionCallBackRsp other = (emu.grasscutter.net.proto.AvatarExpeditionCallBackRspOuterClass.AvatarExpeditionCallBackRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (!internalGetExpeditionInfoMap().equals(
          other.internalGetExpeditionInfoMap())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      if (!internalGetExpeditionInfoMap().getMap().isEmpty()) {
        hash = (37 * hash) + EXPEDITION_INFO_MAP_FIELD_NUMBER;
        hash = (53 * hash) + internalGetExpeditionInfoMap().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.AvatarExpeditionCallBackRspOuterClass.AvatarExpeditionCallBackRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AvatarExpeditionCallBackRspOuterClass.AvatarExpeditionCallBackRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarExpeditionCallBackRspOuterClass.AvatarExpeditionCallBackRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AvatarExpeditionCallBackRspOuterClass.AvatarExpeditionCallBackRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarExpeditionCallBackRspOuterClass.AvatarExpeditionCallBackRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AvatarExpeditionCallBackRspOuterClass.AvatarExpeditionCallBackRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarExpeditionCallBackRspOuterClass.AvatarExpeditionCallBackRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AvatarExpeditionCallBackRspOuterClass.AvatarExpeditionCallBackRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarExpeditionCallBackRspOuterClass.AvatarExpeditionCallBackRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AvatarExpeditionCallBackRspOuterClass.AvatarExpeditionCallBackRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarExpeditionCallBackRspOuterClass.AvatarExpeditionCallBackRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AvatarExpeditionCallBackRspOuterClass.AvatarExpeditionCallBackRsp parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.AvatarExpeditionCallBackRspOuterClass.AvatarExpeditionCallBackRsp prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code AvatarExpeditionCallBackRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AvatarExpeditionCallBackRsp)
        emu.grasscutter.net.proto.AvatarExpeditionCallBackRspOuterClass.AvatarExpeditionCallBackRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.AvatarExpeditionCallBackRspOuterClass.internal_static_AvatarExpeditionCallBackRsp_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMapField(
          int number) {
        switch (number) {
          case 6:
            return internalGetExpeditionInfoMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMutableMapField(
          int number) {
        switch (number) {
          case 6:
            return internalGetMutableExpeditionInfoMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.AvatarExpeditionCallBackRspOuterClass.internal_static_AvatarExpeditionCallBackRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.AvatarExpeditionCallBackRspOuterClass.AvatarExpeditionCallBackRsp.class, emu.grasscutter.net.proto.AvatarExpeditionCallBackRspOuterClass.AvatarExpeditionCallBackRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.AvatarExpeditionCallBackRspOuterClass.AvatarExpeditionCallBackRsp.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        retcode_ = 0;

        internalGetMutableExpeditionInfoMap().clear();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.AvatarExpeditionCallBackRspOuterClass.internal_static_AvatarExpeditionCallBackRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AvatarExpeditionCallBackRspOuterClass.AvatarExpeditionCallBackRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.AvatarExpeditionCallBackRspOuterClass.AvatarExpeditionCallBackRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AvatarExpeditionCallBackRspOuterClass.AvatarExpeditionCallBackRsp build() {
        emu.grasscutter.net.proto.AvatarExpeditionCallBackRspOuterClass.AvatarExpeditionCallBackRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AvatarExpeditionCallBackRspOuterClass.AvatarExpeditionCallBackRsp buildPartial() {
        emu.grasscutter.net.proto.AvatarExpeditionCallBackRspOuterClass.AvatarExpeditionCallBackRsp result = new emu.grasscutter.net.proto.AvatarExpeditionCallBackRspOuterClass.AvatarExpeditionCallBackRsp(this);
        int from_bitField0_ = bitField0_;
        result.retcode_ = retcode_;
        result.expeditionInfoMap_ = internalGetExpeditionInfoMap();
        result.expeditionInfoMap_.makeImmutable();
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.AvatarExpeditionCallBackRspOuterClass.AvatarExpeditionCallBackRsp) {
          return mergeFrom((emu.grasscutter.net.proto.AvatarExpeditionCallBackRspOuterClass.AvatarExpeditionCallBackRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.AvatarExpeditionCallBackRspOuterClass.AvatarExpeditionCallBackRsp other) {
        if (other == emu.grasscutter.net.proto.AvatarExpeditionCallBackRspOuterClass.AvatarExpeditionCallBackRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        internalGetMutableExpeditionInfoMap().mergeFrom(
            other.internalGetExpeditionInfoMap());
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.AvatarExpeditionCallBackRspOuterClass.AvatarExpeditionCallBackRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.AvatarExpeditionCallBackRspOuterClass.AvatarExpeditionCallBackRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int retcode_ ;
      /**
       * <code>int32 retcode = 5;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 5;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.MapField<
          java.lang.Long, emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo> expeditionInfoMap_;
      private com.google.protobuf.MapField<java.lang.Long, emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo>
      internalGetExpeditionInfoMap() {
        if (expeditionInfoMap_ == null) {
          return com.google.protobuf.MapField.emptyMapField(
              ExpeditionInfoMapDefaultEntryHolder.defaultEntry);
        }
        return expeditionInfoMap_;
      }
      private com.google.protobuf.MapField<java.lang.Long, emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo>
      internalGetMutableExpeditionInfoMap() {
        onChanged();;
        if (expeditionInfoMap_ == null) {
          expeditionInfoMap_ = com.google.protobuf.MapField.newMapField(
              ExpeditionInfoMapDefaultEntryHolder.defaultEntry);
        }
        if (!expeditionInfoMap_.isMutable()) {
          expeditionInfoMap_ = expeditionInfoMap_.copy();
        }
        return expeditionInfoMap_;
      }

      public int getExpeditionInfoMapCount() {
        return internalGetExpeditionInfoMap().getMap().size();
      }
      /**
       * <code>map&lt;uint64, .AvatarExpeditionInfo&gt; expedition_info_map = 6;</code>
       */

      @java.lang.Override
      public boolean containsExpeditionInfoMap(
          long key) {
        
        return internalGetExpeditionInfoMap().getMap().containsKey(key);
      }
      /**
       * Use {@link #getExpeditionInfoMapMap()} instead.
       */
      @java.lang.Override
      @java.lang.Deprecated
      public java.util.Map<java.lang.Long, emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo> getExpeditionInfoMap() {
        return getExpeditionInfoMapMap();
      }
      /**
       * <code>map&lt;uint64, .AvatarExpeditionInfo&gt; expedition_info_map = 6;</code>
       */
      @java.lang.Override

      public java.util.Map<java.lang.Long, emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo> getExpeditionInfoMapMap() {
        return internalGetExpeditionInfoMap().getMap();
      }
      /**
       * <code>map&lt;uint64, .AvatarExpeditionInfo&gt; expedition_info_map = 6;</code>
       */
      @java.lang.Override

      public emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo getExpeditionInfoMapOrDefault(
          long key,
          emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo defaultValue) {
        
        java.util.Map<java.lang.Long, emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo> map =
            internalGetExpeditionInfoMap().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       * <code>map&lt;uint64, .AvatarExpeditionInfo&gt; expedition_info_map = 6;</code>
       */
      @java.lang.Override

      public emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo getExpeditionInfoMapOrThrow(
          long key) {
        
        java.util.Map<java.lang.Long, emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo> map =
            internalGetExpeditionInfoMap().getMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }

      public Builder clearExpeditionInfoMap() {
        internalGetMutableExpeditionInfoMap().getMutableMap()
            .clear();
        return this;
      }
      /**
       * <code>map&lt;uint64, .AvatarExpeditionInfo&gt; expedition_info_map = 6;</code>
       */

      public Builder removeExpeditionInfoMap(
          long key) {
        
        internalGetMutableExpeditionInfoMap().getMutableMap()
            .remove(key);
        return this;
      }
      /**
       * Use alternate mutation accessors instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.Long, emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo>
      getMutableExpeditionInfoMap() {
        return internalGetMutableExpeditionInfoMap().getMutableMap();
      }
      /**
       * <code>map&lt;uint64, .AvatarExpeditionInfo&gt; expedition_info_map = 6;</code>
       */
      public Builder putExpeditionInfoMap(
          long key,
          emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo value) {
        
        if (value == null) { throw new java.lang.NullPointerException(); }
        internalGetMutableExpeditionInfoMap().getMutableMap()
            .put(key, value);
        return this;
      }
      /**
       * <code>map&lt;uint64, .AvatarExpeditionInfo&gt; expedition_info_map = 6;</code>
       */

      public Builder putAllExpeditionInfoMap(
          java.util.Map<java.lang.Long, emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo> values) {
        internalGetMutableExpeditionInfoMap().getMutableMap()
            .putAll(values);
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:AvatarExpeditionCallBackRsp)
    }

    // @@protoc_insertion_point(class_scope:AvatarExpeditionCallBackRsp)
    private static final emu.grasscutter.net.proto.AvatarExpeditionCallBackRspOuterClass.AvatarExpeditionCallBackRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.AvatarExpeditionCallBackRspOuterClass.AvatarExpeditionCallBackRsp();
    }

    public static emu.grasscutter.net.proto.AvatarExpeditionCallBackRspOuterClass.AvatarExpeditionCallBackRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AvatarExpeditionCallBackRsp>
        PARSER = new com.google.protobuf.AbstractParser<AvatarExpeditionCallBackRsp>() {
      @java.lang.Override
      public AvatarExpeditionCallBackRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new AvatarExpeditionCallBackRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<AvatarExpeditionCallBackRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AvatarExpeditionCallBackRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.AvatarExpeditionCallBackRspOuterClass.AvatarExpeditionCallBackRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AvatarExpeditionCallBackRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AvatarExpeditionCallBackRsp_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AvatarExpeditionCallBackRsp_ExpeditionInfoMapEntry_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AvatarExpeditionCallBackRsp_ExpeditionInfoMapEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!AvatarExpeditionCallBackRsp.proto\032\032Ava" +
      "tarExpeditionInfo.proto\"\321\001\n\033AvatarExpedi" +
      "tionCallBackRsp\022\017\n\007retcode\030\005 \001(\005\022P\n\023expe" +
      "dition_info_map\030\006 \003(\01323.AvatarExpedition" +
      "CallBackRsp.ExpeditionInfoMapEntry\032O\n\026Ex" +
      "peditionInfoMapEntry\022\013\n\003key\030\001 \001(\004\022$\n\005val" +
      "ue\030\002 \001(\0132\025.AvatarExpeditionInfo:\0028\001B\033\n\031e" +
      "mu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.getDescriptor(),
        });
    internal_static_AvatarExpeditionCallBackRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AvatarExpeditionCallBackRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AvatarExpeditionCallBackRsp_descriptor,
        new java.lang.String[] { "Retcode", "ExpeditionInfoMap", });
    internal_static_AvatarExpeditionCallBackRsp_ExpeditionInfoMapEntry_descriptor =
      internal_static_AvatarExpeditionCallBackRsp_descriptor.getNestedTypes().get(0);
    internal_static_AvatarExpeditionCallBackRsp_ExpeditionInfoMapEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AvatarExpeditionCallBackRsp_ExpeditionInfoMapEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
